import java.util.Scanner;

public class CoinFlip{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String coin, again;
            int streak = 0;
            boolean gotHeads;
            
            do {
                gotHeads = Math.random() < 0.5;
                
                if (gotHeads)
                    coin = "HEADS";
                else
                    coin = "TAILS";
                    
                System.out.println("You flip a coin and it is..." + coin);
                if (gotHeads) {
                    streak++;
                    System.out.println("\tThats "+ streak + " in a row...");
                    System.out.print("Would you like to flip again (y/n)?");
                    again = s.next();
                }
                else {
                    System.out.println("\tYou loose everything...");
                    streak = 0;
                    again = "n";
                }
            } while (again.equals("y"));
            
            System.out.println("Final score: " + streak);
        }
    }
}
