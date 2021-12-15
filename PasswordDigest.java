import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordDigest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String password, generatedPassword = null;
        
        System.out.print("Enter password: ");
        password = s.nextLine();
        
        try{
        
            //create instance of digest MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            //add password to digest
            md.update(password.getBytes());
            
            //get the bytes array
            
            byte[] bytes = md.digest();
            
            //bytes[] in decimal format convert them to hexidecimal
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        System.out.println("Done..");
        System.out.println(generatedPassword);
        
    }
}
