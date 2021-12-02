public class RandomNumbers {
    public static void main (String args []) {
        
        int a, b, c, d;
        double r, rps;
        
        rps = Math.random();
        
        if (rps < 0.3333333)
            System.out.println("ROCK");
            
        else if(rps < 0.6666667)
            System.out.println("PAPER");
        else     
        
        
            System.out.println("SZA");
        
        //random numbers with a range
        
        a = 1 + (int)(10*Math.random());
        b = 1 + (int)(10*Math.random());
        c = 1 + (int)(10*Math.random());
        d = 1 + (int)(10*Math.random());
        System.out.println( "1-10: \t" + a + "\t" + b + "\t" + c + "\t" + d);
        
        a = (int)(10*Math.random());
        b = (int)(10*Math.random());
        c = (int)(10*Math.random());
        d = (int)(10*Math.random());
        
        System.out.println( "0-9 " + a + " " + b + " " + c + " " + d );
        
        a = 20 + (int)(30*Math.random());
        b = 20 + (int)(30*Math.random());
        c = 20 + (int)(30*Math.random());
        d = 20 + (int)(30*Math.random());
        
        System.out.println("20-30: " + a + " " + b + " " + c + " " + d);
    }
}
