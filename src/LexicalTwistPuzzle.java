import java.util.Scanner;

/**
 * Prints characters based on vowel-consonant distribution rules.
 */
import java.util.LinkedHashSet;
public class LexicalTwistPuzzle {
    // Preserve order and uniqueness
    LinkedHashSet<Character> unique = new LinkedHashSet<>();

for (char ch : combined.toCharArray()) {
        unique.add(ch);
    }

    int count = 0;

if (vowels > consonants) {

        for (char ch : unique) {
            if ("AEIOU".indexOf(ch) != -1) {
                System.out.print(ch);
                count++;
            }
            if (count == 2) break;
        }

    } else if (consonants > vowels) {

        for (char ch : unique) {
            if ("AEIOU".indexOf(ch) == -1 && Character.isLetter(ch)) {
                System.out.print(ch);
                count++;
            }
            if (count == 2) break;
        }

    } else {
        System.out.println("Vowels and consonants are equal");
    }

    }
}
