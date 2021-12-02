import java.util.Scanner;

public class BankOps{
    public static void main(String [] args){
        String pin = "12345", entry;
        
        Scanner s = new Scanner(System.in);
        System.out.print("WELCOME  TO BANKOPS! \nPLEASE ENTER YOUR PIN");
        entry = s.next();
        
        while(!entry.equals(pin)) {
            System.out.print("PIN IS WRONG... \n TRY AGAIN.. ");
            entry = s.next();
        }
        
        System.out.println("PIN IS CORRECT! \nYour account Balance is $12345");
    }
}
