import java.util.Scanner;

/**
 * LexicalTwistPuzzle
 *
 * This version accepts two words from the user.
 * No validation is performed yet.
 *
 * Concepts Used:
 * - Scanner
 * - String input
 */
public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Display title
        System.out.println("Lexical Twist Puzzle");

        // Accept first word
        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        // Accept second word
        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // Print entered words
        System.out.println("First Word: " + firstWord);
        System.out.println("Second Word: " + secondWord);

    }
}
