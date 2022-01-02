import java.util.Scanner;

public class ItemNotFound {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {

            String[] heroes = { "Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
            "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
            "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
            "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus" };

            System.out.println("Name one greek mythology hero: ");
            try {
                String guess = s.nextLine();
                boolean found = false;

                for (String hero : heroes) {
                    if (guess.equals(hero)) {
                        System.out.println("You guesed right! " + guess +" is a Greek Hero.");
                        found = true;
                    }
                }

                if (found == false)
                    System.out.println("No, " + guess + " is not a greek hero");
            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
