import java.util.Scanner;
import static java.lang.System.*;

public class DictionaryOrder {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(in)) {
            String name, css = "css";
            
            out.println("Enter a made up language name: ");
            name = s.nextLine();
            //int n = name.toLowerCase().compareTo(css);
            int n = name.compareToIgnoreCase(css);
            
            if(n < 0) {
                out.println(name + " comes before css");
            }
            
            if(n == 0){
                out.println("css is not a made up language");
            }
            
            if(n > 0) {
                out.println(name + " comes after css");
            }
        }
    }
}
