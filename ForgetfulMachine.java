import java.util.Scanner;

public class ForgetfulMachine {
	public static void main (String [] args) {
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("What city is the capital of France?");
			
			keyboard.nextLine();
			
			System.out.println(" What is 6 multiplied by 7? ");
			keyboard.nextInt();
			
			System.out.println("Enter a number btwn 0.1 and 1.0");
			keyboard.nextDouble();
			
			System.out.println("Is thee anything else you want to tell the comp??");
			keyboard.next();
		}
	}
}
