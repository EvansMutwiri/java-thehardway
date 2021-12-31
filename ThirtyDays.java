import java.util.Scanner;
import static java.lang.System.*;

public class ThirtyDays {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int month, days = 31;
            String monthName;

            System.out.println("Enter month \"1-12\"");
            month = s.nextInt();

            switch (month) {
                case 1:
                    monthName = "Jan";
                    break;
                case 2:
                    monthName = "Feb";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "Aug";
                    break;
                case 9:
                    monthName = "Sept";
                    break;
                case 10:
                    monthName = "Oct";
                    break;
                case 11:
                    monthName = "Nov";
                    break;
                case 12:
                    monthName = "Dec";
                    break;
                default:
                    monthName = "Error";
            }

            switch (month) {
                case 2:
                    days = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    days = 31;
            }

            out.println(monthName + " has " + days + " days.");
        }
    }
}
