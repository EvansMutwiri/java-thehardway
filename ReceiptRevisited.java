import java.io.PrintWriter;
import java.io.IOException;

public class ReceiptRevisited{
    public static void main(String[] args) throws Exception {
    
    PrintWriter fileout;
        
        try{
            fileout = new PrintWriter("receipt.txt");
        }
        
        catch(IOException err){
            System.out.println("Cannot open the file");
            
            fileout = null;
            System.exit(1);
        }
        
        fileout.println("+-------------------------------+");
        fileout.println("|                               |");
        fileout.println("|        CORNER STORE           |");
        fileout.println("|                               |");
        fileout.println("|       2021 - 12 - 11          |");
        fileout.println("|                               |");
        fileout.println("|       Fuel Total - $ 23.97    |");
        fileout.println("|                               |");
        fileout.println("+-------------------------------+");
        fileout.close();
    }
}
