import java.util.Scanner;

/**
 * LexicalTwistPuzzle
 *
 * This version validates that each input contains only one word.
 * If whitespace is detected, the program terminates safely.
 *
 * Concepts Used:
 * - String validation
 * - Defensive programming
 * - Early return strategy
 */
public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Accept first word
        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        // Validate first word
        if (firstWord.contains(" ")) {
            System.out.println(firstWord + " is an invalid word");
            return;
        }

        // Accept second word
        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // Validate second word
        if (secondWord.contains(" ")) {
            System.out.println(secondWord + " is an invalid word");
            return;
        }

        // Continue only if valid
        System.out.println("Valid inputs received.");

    }
}
