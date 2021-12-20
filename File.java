import java.io.IOException;
import java.io.PrintWriter;

public class File {
    public static void main(String[] args){
        PrintWriter fileout;
        
        
        try {
            
            fileout = new PrintWriter("my-file.txt");
        } catch(IOException e) {
            fileout = null;
            System.exit(1);
        }
        
        fileout.println("The man in black fled across the desert, and the gunslinger followed./n/nAsk not what your country can do for you; ask what you can do for your country./n/ni will be/nM o ving in the Street of her/n/nbodyfee l inga ro undMe the traffic of lovely;muscles-sinke x p i r i n/n");
        
        fileout.close();
    }
}
