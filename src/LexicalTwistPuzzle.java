import java.util.Scanner;

/**
 * Applies transformation if reverse match is true.
 * - Convert to lowercase
 * - Replace vowels with '@'
 */

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        if (reversed.equalsIgnoreCase(secondWord)) {

            // Convert to lowercase
            String lower = reversed.toLowerCase();

            // Replace vowels
            String transformed = lower.replaceAll("[aeiou]", "@");

            // Print result
            System.out.println(transformed);
        }


    }
}
