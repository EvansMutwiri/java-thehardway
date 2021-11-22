import java.util.Scanner;


public class RudeQuestions {
	public final void main(String [] args) {
		String name;
		int age;
		double weight, income;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Whats your name hombre");
		name = s.nextLine();
		
		System.out.println("Whats your age amigo ");
		age = s.nextInt();
		
		System.out.println("We almost there, \nWhats your weight in kg?");
		weight = s.nextDouble();
		
		System.out.println("Last question gentleman \nWhats your level of income Mr." +name + "?");
		income = s.nextDouble();
		
		System.out.println("TOP OF THE MORNING");
	}
}
