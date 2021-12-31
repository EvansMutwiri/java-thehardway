import java.util.Scanner;

public class GoatOrNot {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			String word;
			boolean yep, nope;
			
			System.out.println("Type your fav artist ill tell you if goat or not: ");
			
			word = s.nextLine();
			yep = "kenny".equals(word);
			nope = !word.equals("kenny");
			
			System.out.println("GOAT STATUS= " + yep);

			System.out.println("Try again cause " + nope);
		}
	}
}
