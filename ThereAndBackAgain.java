public class ThereAndBackAgain {
    public static void main(String[] args) {
        here();
        there();
        back();
        again();
    }
    
    //order doesnt matter
    
    public static void again() {
        there();
    }
    public static void here() {
        System.out.println("HERE!");
    }
    public static void there(){
        System.out.println("THERE");
    }
    public static void back() {
        here();
    }
    
    
}
