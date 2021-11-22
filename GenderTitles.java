import java.util.Scanner;
import static java.lang.System.*;

public class GenderTitles{
	public static void main (String args []) {
	
	Scanner s = new Scanner(System.in);
	String first, last, title = "error", gender;
	int age;
	
	out.println("Enter your Name: ");
	first= s.nextLine();
	
	out.println("Enter your last name: ");
	last = s.nextLine();
	
	out.println("Enter gender \"M/F\"");
	gender = s.next();
	
	out.println("Enter age: ");
	age = s.nextInt();
	
	if(age < 20) {
		title = first;
		}
	else {
		if (gender.equals("F")) {
			out.println("Are you married? " + first);
			String married = s.next();
			
			if(married.equals("Y")) {
				title = "Mrs. ";
			} else {
				title = "Ms. ";
			}
		} else if(gender.equals("M")) {
			title = "Mr. ";
		}
	}
	
	out.println("Hello \t" + title+"\t" + last);
   }
}
