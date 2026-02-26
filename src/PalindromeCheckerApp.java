import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create Scanner
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters from both ends
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Is Palindrome? = " + isPalindrome);

        sc.close();
    }
}