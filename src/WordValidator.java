/**
 * WordValidator
 *
 * Responsible for validating user inputs.
 * Ensures only single-word input is accepted.
 *
 * Demonstrates:
 * - Single Responsibility Principle
 * - Encapsulation
 */
public class WordValidator {

    // Validate single word constraint
    public boolean isValid(String word) {
        return !word.contains(" ");
    }
}
