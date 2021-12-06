public class YatchDice{
    public static void main(String[] args){
        int r1, r2, r3, r4, r5;
        boolean allSame;
        
        do {
        r1 = 1 + (int)(Math.random()*6);
        r2 = 1 + (int)(Math.random()*6);
        r3 = 1 + (int)(Math.random()*6);
        r4 = 1 + (int)(Math.random()*6);
        r5 = 1 + (int)(Math.random()*6);
        
        System.out.println("You rolled: " + r1 + " " + r2 + r3 + r4 + r5);
        
        showDice(r1);
        showDice(r2);
        showDice(r3);
        showDice(r4);
        showDice(r5);
        
        allSame = (r1 == r2 && r2 == r3 && r3 == r4 && r4 == r5);
    } while (! allSame);
    
    System.out.println("The Yatch!!");
    }
    
    public static void showDice(int roll) {
        System.out.println("+---+");
        
        if (roll == 1) {
            System.out.println("|   | \n| o |\n|o o|");
        }
        
        else if (roll == 2) {
            System.out.println("|o  | \n|   | \n|  o|");
        }
        
        else if (roll == 3){
            System.out.println("|o  | \n| o | \n|  o|");
        }
        
        System.out.println("+---+");
    }
}
