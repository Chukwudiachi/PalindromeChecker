import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word to check if it's a palindrome: ");
        String word = scanner.nextLine();

        // Check if the word is a palindrome
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Function to check if a word is a palindrome
    public static boolean isPalindrome(String word) {
        // Convert the word to lowercase to ignore case sensitivity
        word = word.toLowerCase();

        // Initialize pointers for the beginning and end of the word
        int start = 0;
        int end = word.length() - 1;

        // Traverse the word from both ends towards the center
        while (start < end) {
            // If characters at the start and end positions are not equal, it's not a palindrome
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            // Move the pointers towards the center
            start++;
            end--;
        }
        // If the loop completes without returning false, the word is a palindrome
        return true;
    }
}
