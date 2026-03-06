public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input
        String input = "level";

        // Inject strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


/* ======================================================
   INTERFACE : PalindromeStrategy
   Defines contract for palindrome algorithms
   ====================================================== */

interface PalindromeStrategy {

    boolean check(String input);
}


/* ======================================================
   CLASS : StackStrategy
   Stack based palindrome algorithm
   ====================================================== */

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        // Create stack
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}