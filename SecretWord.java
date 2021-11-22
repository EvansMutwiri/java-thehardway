import java.util.Scanner;

public class SecretWord {
	public static void main(String[] args) {
		System.out.println("Whats the secret word");
		
		Scanner s = new Scanner(System.in);
		String secret = s.nextLine();
		
		if(secret.equals("getit"))
			System.out.println("yass");
		else
			System.out.println("wrong answer its not " + secret);
	}
}
