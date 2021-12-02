import java.util.Scanner;

public class KeepGuessing{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num, guess;
        
        num = 1 + (int)(10*Math.random());
        
        System.out.println("Guess a number between 1 and 10");
        guess = s.nextInt();
        
        while(guess != num) {
            System.out.println("Your guess is wrong!");
            guess = s.nextInt();
        }
        
        System.out.println("Correct");
        
    }
}
