import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int[] orderNumbers = { 12345, 54321, 23411, 101010, 456789, 567895 };

            int toFind;

            //total number of orders
            System.out.println("TOTAL ORDERS: "+orderNumbers.length);

            //print each order
            for ( int order : orderNumbers) {
                System.out.print(order + " ");
            }

            //find specific order
            System.out.println();
            System.out.println("Which order to find: ");
            try {
                toFind = s.nextInt();
                for ( int order : orderNumbers) {
                    boolean found = order == toFind;
                    if (found) {
                        System.out.println( "Order number: " + order + " found");
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input -- must be a number");
            }
        }
        
    }
}
