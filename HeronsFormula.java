public class HeronsFormula {
    public static void main(String[] args){
        double a, g;
        
        String tws = "A triangle with sides ";
        
        a = triangleArea(3,3,3);
        
        System.out.println(tws + "3 by 3 by 3 " + a);
        
        g = triangleArea(10,11,13);
        System.out.println(tws + "10 by 11 by 13 " + g);
    }
    
    public static double triangleArea(int a, int b, int c){
        double s, Area;
        
        s = (a+b+c)/2;
        Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        return Area;
    }
}
