import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int choice; 
        double area = 0;
        
        System.out.println("Shape area Calculator");
        
        do {
            System.out.println("\n=================================\n");
            System.out.println("1) Triangle\n2) Circle\n3)Rectangle\n4) Quit\n>");
            
            choice = s.nextInt();
            
            if (choice == 1 ){
                System.out.println("Base: ");
                int b = s.nextInt();
                System.out.println("Height: ");
                int h = s.nextInt();
                
                area = computeTriangleArea(b, h);
                System.out.println("The area is " + area);
            }
            
            else if( choice == 2 ) {
                System.out.print("Radius");
                int r = s.nextInt();
                
                area = computeCircleArea(r);
                System.out.print("\nThe area of the circle is " + area);
                
            }
            
            else if (choice == 3) {
                System.out.println("Length");
                int l = s.nextInt();
                System.out.println("Width: ");
                int w = s.nextInt();
                area = computeRectArea(l, w);
                System.out.println("Area of the rectangle is "+ area);
            }
            
            else if(choice != 4) {
                System.out.println("ERROR.");
            }
        }while (choice != 4);
    }
    
    public static double computeTriangleArea(int b, int h) {
        double areaTri = 0.5 * b * h;
        
        return areaTri;
    }
    
    public static double computeCircleArea(int r){
        double areaCircle = (Math.PI * r *r);
        return areaCircle;
    }
    public static double computeRectArea(int l, int w){
        double areaRect = l * w;
        return areaRect;
    }
}
