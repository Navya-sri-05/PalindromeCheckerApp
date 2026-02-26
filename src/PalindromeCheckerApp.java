import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create Scanner
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);     // FIFO
            stack.push(c);    // LIFO
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare until queue becomes empty
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Is Palindrome? = " + isPalindrome);

        sc.close();
    }
}