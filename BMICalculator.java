import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double pounds, inches, m, kg, bmi;

			System.out.println("WELCOME TO BMI CALC \n\nPlease enter your body height in inches...");
			inches = scanner.nextDouble();
			m = 0.0254 * inches;

			System.out.println("Now enter your mass in pounds...");
			pounds = scanner.nextDouble();
			kg = 0.453592 * pounds;

			bmi = kg / (m * m);
			System.out.println("Your BMI is " + bmi);
		}
	}
}
