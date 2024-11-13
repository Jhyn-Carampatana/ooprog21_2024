import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String word1 = scanner.nextLine();

        System.out.println("Enter the second word:");
        String word2 = scanner.nextLine();

        if (isValidWord(word1) && isValidWord(word2)) {
            String spoonerizedWord1 = swapFirstConsonants(word1, word2);
            String spoonerizedWord2 = swapFirstConsonants(word2, word1);
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        } else {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        }
    }

    public static boolean isValidWord(String word) {
        // Check if the word has at least one vowel and doesn't start with a vowel
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                return i != 0; // True if it has a vowel and doesn't start with one
            }
        }
        return false; // No vowel found
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static String swapFirstConsonants(String word1, String word2) {
        // Find the first vowel in each word
        int vowelIndex1 = findFirstVowel(word1);
        int vowelIndex2 = findFirstVowel(word2);

        // If both words have vowels, swap the first consonants
        if (vowelIndex1 != -1 && vowelIndex2 != -1) {
            return word1.substring(0, 1).replace(word1.charAt(0), word2.charAt(0)) +
                   word1.substring(1, vowelIndex1) +
                   word2.charAt(vowelIndex2) +
                   word1.substring(vowelIndex1 + 1);
        } else {
            return word1; // Return the original word if no swap is possible
        }
    }

    public static int findFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                return i;
            }
        }
        return -1; // No vowel found
    }
}