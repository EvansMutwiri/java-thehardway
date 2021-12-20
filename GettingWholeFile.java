import java.io.File;
import java.util.Scanner;

public class GettingWholeFile{
    public static void main(String[] args) throws Exception {
        int fourLetter = 0, caps = 0;
        
        String fn1 = "my-file.txt";
        String fn2 = "my-file.txt";
        
        Scanner r = new Scanner(new File(fn1));
        while (r.hasNext()) {
            String w = r.next();
            if(w.length() == 4){
                fourLetter ++;
            }
        }
        
        r.close();
        
        Scanner s = new Scanner(new File(fn2)); 
        while (s.hasNext()) {
            String word = s.next();
            
            if (Character.isUpperCase(word.charAt(0))){
                caps ++;
            }
        }
        s.close();
        
        System.out.println(fourLetter + "\n" + caps);
    }
}
