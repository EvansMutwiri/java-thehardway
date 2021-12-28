import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class ShallowGrandma {
	public static void main(String [] args) {
		int age;
		double income, cute, happy;
		boolean allowed;
		boolean allowed2;
		Date date = Date.valueOf(LocalDate.now().toString());
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter your age: ");
			age = s.nextInt();
			
			System.out.println("Enter your income: ");
			income = s.nextDouble();
			
			System.out.println("Cute level: 0.0 to 10.0 ");
			cute = s.nextDouble();
			
			allowed = (age >= 25 && age <= 40 && (income >= 40000 || cute >= 8.5));
			
			System.out.println("How happy do you make her? 0-10");
			happy = s.nextDouble();
		}
		
		allowed2 = (happy >= 9);
		
		System.out.println("Your allowed status by shallow grandma is " + allowed);
		
		System.out.println("Non shallow grandma allowed status is " + allowed2 + " on " + date);
		
	}
}
