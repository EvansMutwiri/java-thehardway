import java.util.Scanner;
import static java.lang.System.*;

public class EnterPin{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //used string instead of int to prevent InputMismatchException
        
        String pin = "12345", entry;
        
        out.println("WELCOME TO BOK");
        out.println("Please enter your pin: ");
        
        entry = s.next();
        while(!entry.equals(pin)) {
            out.println("You entered wrong pin! \n Try again");
            entry = s.next();
        }
        
        out.println("REQUEST SUCCESSFUL, YOUR ACC BAL IS $12345");
    }
}
