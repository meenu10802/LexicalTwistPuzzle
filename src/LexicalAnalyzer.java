import java.util.LinkedHashSet;

/**
 * LexicalAnalyzer
 *
 * Contains all puzzle logic including:
 * - Reverse check
 * - Word transformation
 * - Combination analysis
 * - Rule-based output
 *
 * Demonstrates:
 * - Encapsulation
 * - Reusability
 * - Clean business logic separation
 */
public class LexicalAnalyzer {

    // Check reverse relationship
    public boolean isReverse(String first, String second) {
        String reversed = new StringBuilder(first).reverse().toString();
        return reversed.equalsIgnoreCase(second);
    }

    // Transform word
    public String transform(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed.toLowerCase().replaceAll("[aeiou]", "@");
    }

    // Analyze combined words
    public void analyze(String first, String second) {

        String combined = (first + second).toUpperCase();
        int vowels = 0;
        int consonants = 0;

        // Count characters
        for (char ch : combined.toCharArray()) {
            if ("AEIOU".indexOf(ch) != -1) vowels++;
            else if (Character.isLetter(ch)) consonants++;
        }

        // Rule-based output
        LinkedHashSet<Character> unique = new LinkedHashSet<>();
        for (char ch : combined.toCharArray()) unique.add(ch);

        int count = 0;

        if (vowels > consonants) {
            for (char ch : unique) {
                if ("AEIOU".indexOf(ch) != -1) {
                    System.out.print(ch);
                    if (++count == 2) break;
                }
            }
        } else if (consonants > vowels) {
            for (char ch : unique) {
                if ("AEIOU".indexOf(ch) == -1 && Character.isLetter(ch)) {
                    System.out.print(ch);
                    if (++count == 2) break;
                }
            }
        } else {
            System.out.println("Vowels and consonants are equal");
        }
    }
}
