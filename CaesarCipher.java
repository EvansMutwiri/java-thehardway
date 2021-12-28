import java.util.Scanner;

public class CaesarCipher {

    /**
     * Returns the character shifted by the given number of letters ie shift.
     */

    public static char shiftLetter(char c, int n) {
        int u = c;

        if (!Character.isLetter(c))
            return c;

        u = u + n;
        if (Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u > 'z') {
            u -= 26;
        }
        if (Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a') {
            u += 26;
        }
        return (char) u;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String plainText, cipher = "";
            int shift;

            System.out.println("Message: ");
            plainText = s.nextLine();

            System.out.println("Shift(0-26): ");

            try {
                shift = s.nextInt();
                for (int i = 0; i < plainText.length(); i++) {
                    cipher += shiftLetter(plainText.charAt(i), shift);
                }
                System.out.println(cipher);
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }
    }
}