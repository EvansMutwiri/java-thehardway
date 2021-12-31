import java.util.Scanner;
import static java.lang.System.*;

public class PigDice{
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            int roll, ptot, ctot, turnTotal;
            String choice = "";
            
            ptot = 0;
            ctot = 0;
            
            do {
                turnTotal = 0;
                out.println("You have " + ptot + " points.");
                
                do{
                    roll = 1 + (int)(Math.random()*6);
                    out.println("\tYou rolled a " + roll);
                    if(roll == 1){
                        out.println("That ends your turn");
                        turnTotal = 0;
                    } else {
                        turnTotal += roll;
                        out.println("\tYou have " + turnTotal + " points. so far");
                        out.println("\tWould you like to roll again or hold?");
                        choice = s.next();
                        
                    }
                } while (roll != 1 && choice.equals("roll"));
                
                ptot += turnTotal;
                System.out.println("\tYou end the round with " + ptot + " points.");
                
                if(ptot < 100) {
                    turnTotal = 0;
                    out.println("Computer has " + ctot + " points.");
                    
                    do {
                        roll = 1 + (int)(Math.random()*6);
                        out.println("\tComputer rolled a " + roll);
                        if(roll == 1) {
                            System.out.println("\tThat ends the turn");
                            turnTotal = 0;
                        } else {
                            turnTotal += roll;
                            System.out.println("Computer has " + turnTotal + " points so far.");
                            if (turnTotal < 20){
                                System.out.println("Computer will roll again");
                            }
                        }
                    } while (roll != 1 && turnTotal < 20);
                    
                    ctot += turnTotal;
                    System.out.println("\tComputer ends the round with " + ctot + " points.\n");
                }
            } while (ptot < 100 && ctot < 100);

            if (ptot > ctot) {
                out.println("Humanity wins!!🤣️");
            } else {
                out.println("Robot wins!😱️");
            }
        }
    }
}
