import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int current, total = 0;
        
        System.out.println("Enter number to add and 0 to stop");
        
        do {
            current = s.nextInt();
            total += current;
            if(current !=0){
            System.out.println("the current total is "+total);
            }  
        } while(current != 0);
        
        System.out.println("The final total is " + total);
        }
    }
