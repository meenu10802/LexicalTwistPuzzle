import java.util.Scanner;

/**
 * Combines both words and counts vowels and consonants.
 */

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        // Combine words
        String combined = (firstWord + secondWord).toUpperCase();

        int vowels = 0;
        int consonants = 0;

// Count characters
        for (char ch : combined.toCharArray()) {

            if ("AEIOU".indexOf(ch) != -1) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);



    }
}
