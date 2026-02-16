<<<<<<< HEAD
/**
 * LexicalTwistPuzzle
 *
 * This class represents the entry point of the Lexical Twist Puzzle application.
 * It currently only displays the application title.
 *
 * Concepts Used:
 * - Class declaration
 * - main() method
 * - Console output
=======
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
>>>>>>> feature/uc2-input
 */
public class LexicalTwistPuzzle {

    public static void main(String[] args) {

<<<<<<< HEAD
        // Display the application title
        System.out.println("Lexical Twist Puzzle");

=======
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

>>>>>>> feature/uc2-input
    }
}
