import java.util.Scanner;

/**
* Contains funtions ie procedural programming
*/
public class ThirtyDaysFun{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Which month? (1-12) ");
        int month = s.nextInt();
        System.out.println(monthDays(month) + " days hath " + monthName(month));
    }
    /**
    * Returns name of the given month 1 -12
    *
    * @author eazybytes
    * @param month the month number 1-12
    * @return the english name of the month or default value error if out of range
    */
    public static String monthName(int month) {
        String monthName = "error";
        
        if ( month == 1 )
            monthName = "Jan";
            
        else if( month == 2 )
            monthName = "Feb";
            
        else if( month == 3 )
            monthName = "Mar";
        else if ( month == 4 )
            monthName = "April";
        else if ( month == 5 )
            monthName = "May";
        else if ( month == 6 )
            monthName = "June";
        else if ( month == 7 )
            monthName = "July";
        else if ( month == 8 )
            monthName = "Aug";
        else if ( month == 9 )
            monthName = "Sept";
        else if ( month == 10 )
            monthName = "Oct";
        else if ( month == 11 )
            monthName = "November";
        else if( month == 12)
            monthName = "December";
            
        return monthName;           
            
    }
    
    /**
    * Returns the number of days corresponding to a given month
    * @author eazybytes
    * @param month the month number (1-12);
    * @return  the number of days in the month
    */
    public static int monthDays(int month) {
        int days;
        
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: days = 31;
                break;
            case 2: days = 28;
                break;
            
            default: days = 30;
        }
        
        return days;
    }
}
