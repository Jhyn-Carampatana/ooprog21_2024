import java.util.Scanner;

public class Palindrome_Checker {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String cleanString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = new StringBuilder(cleanString).reverse().toString().equals(cleanString);

        if (isPalindrome) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }
    }
}