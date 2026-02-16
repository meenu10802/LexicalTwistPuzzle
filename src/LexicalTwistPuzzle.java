import java.util.Scanner;

/**
 * LexicalTwistPuzzle
 *
 * Entry point of the application.
 * Handles user input and delegates logic to other classes.
 *
 * Demonstrates:
 * - Abstraction
 * - Clean architecture
 */
public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        WordValidator validator = new WordValidator();
        LexicalAnalyzer analyzer = new LexicalAnalyzer();

        // Collect inputs
        System.out.print("Enter first word: ");
        String first = scanner.nextLine();

        System.out.print("Enter second word: ");
        String second = scanner.nextLine();

        // Validate inputs
        if (!validator.isValid(first) || !validator.isValid(second)) {
            System.out.println("Invalid word entered.");
            return;
        }

        // Process logic
        if (analyzer.isReverse(first, second)) {
            System.out.println(analyzer.transform(first));
        } else {
            analyzer.analyze(first, second);
        }
    }
}
