import java.util.Scanner;
import static java.lang.System.*;

public class Admission {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int math;
		
		out.println("WELCOME TO COLLEGE ADMIN");
		out.println("Please enter your SAT scores in math: ");
		
		math = s.nextInt();
		
		out.println("Admission Status: ");
		
		if(math >= 700)
			out.println("ACCEPTED");
		else if(math >= 600)
			out.println("SAFE");
		else if(math >= 500)
			out.println("PROBABLE");
		else if(math >= 400)
			out.println("UNLIKELY");
		else
			out.println("REJECTED");
			out.println("TRY AGAIN");
	}
}
