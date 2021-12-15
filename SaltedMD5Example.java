import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Scanner;

public class SaltedMD5Example{
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {
        Scanner s = new Scanner(System.in);
        
        System.out.print("ENTER PASSWORD: ");
        String passwordToHash = s.nextLine();
        String salt = getSalt();
        
        String securePassword = getSecurePassword(passwordToHash, salt);
        
        System.out.println(securePassword);
        
        String regeneratedPasswordToVerify = getSecurePassword(passwordToHash, salt);
        
        System.out.println("regenerated" + regeneratedPasswordToVerify);
    }
    
    private static String getSecurePassword(String passwordToHash, String salt) {
        String generatedPassword = null;
        
        try {
        
            //create MessageDigest instance for md5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Add password bytes to digest
            byte[] bytes = md.digest(passwordToHash.getBytes());
            
            //convert bytes to hexidecimal format
            
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            
            //complete hashed password in string form
            generatedPassword = sb.toString();
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        return generatedPassword;
    }
    
        //add salt
        
    private static String getSalt() throws NoSuchAlgorithmException, NoSuchProviderException {
        //Secure random generator
        
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "SUN");
        
        //Create array for salt
        byte[] salt = new byte[16];
        
        //Get a random salt
        sr.nextBytes(salt);
        
        //return salt
        
        return salt.toString();
    }
}
