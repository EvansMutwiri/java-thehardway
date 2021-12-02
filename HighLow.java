import java.util.Scanner; 
 
 public class HighLow {
    public static void main(String [] args) {
        
        Scanner s = new Scanner(System.in);
        int num, guess;
        num = 1 + (int)(11*Math.random());
        
        System.out.println("I'm thinking of a number between 1 - 100 \nGuess the number: ");
        guess = s.nextInt();
        
        while(num != guess) {
            if(num < guess) {
                System.out.println("Your guess is too high");
                //guess = s.nextInt();
            }
            if (num > guess) {
                System.out.println("Your guess is too low");
                //guess = s.nextInt();
            }
            guess = s.nextInt();
        }
        System.out.print("Your guess is " + guess + "\nYou are Righter than Ian!! What are the odds!");
    }
 }
