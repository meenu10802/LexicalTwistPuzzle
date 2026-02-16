import java.util.Scanner;

/**
 * LexicalTwistPuzzle
 *
 * This version checks whether the second word is
 * the reverse of the first word (case-insensitive).
 *
 * Concepts Used:
 * - StringBuilder
 * - equalsIgnoreCase()
 */

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Reverse first word
        String reversed = new StringBuilder(firstWord).reverse().toString();

// Check reverse match
        if (reversed.equalsIgnoreCase(secondWord)) {
            System.out.println("Words are reverse of each other.");
        } else {
            System.out.println("Words are NOT reverse.");
        }


    }
}
