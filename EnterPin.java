import java.util.Scanner;
import static java.lang.System.*;

public class EnterPin{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String pin = "12345", entry;
            
            out.println("WELCOME TO BOK");
            out.println("Please enter your pin: ");
            
            entry = s.next();
            while(!entry.equals(pin)) {
                out.println("You entered wrong pin! \n Try again");
                entry = s.next();
            }
        }
        
        //used string instead of int to prevent InputMismatchException
        
        out.println("REQUEST SUCCESSFUL, YOUR ACC BAL IS $12345");
    }
}
