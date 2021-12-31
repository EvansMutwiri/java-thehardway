/**
 * “Farmer Brown wants to spend exactly $100.00 and wants to purchase exactly
 * 100 animals. If sheep cost $10 each, goats cost $3.50 each and chickens are
 * $0.50 apiece, then how many of each animal should he buy? (He wants at least
 * one of each type of animal.)”
 */

public class FarmerBrown {
    public static void main(String[] args) {
        for (int sheep = 1; sheep < 10; sheep++)
            for (int goat = 1; goat < 28; goat++)
                for (int chicken = 1; chicken < 100; chicken++)
                    if (sheep + goat + chicken == 100 && sheep * 10 + goat * 3.50 + chicken * 0.50 == 100)
                        System.out.println(sheep + " sheep, " + goat + " goats, and " + chicken + " chicken.");
    }
}
