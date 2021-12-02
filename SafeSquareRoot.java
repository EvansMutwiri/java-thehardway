import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        double x, y;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number no negatives allowed!");
        x = s.nextDouble();
        
        while(x < 0) {
            System.out.println("negatives not allowed.. \nTry again");
            x = s.nextDouble();
        }
        
        y = Math.sqrt(x);
        
        System.out.println("The square root of " + x + " is " + y);
        
        
    }
}
