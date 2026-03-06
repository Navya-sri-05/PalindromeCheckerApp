public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "racecar";

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call service method
        boolean result = service.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


// Service class that contains palindrome logic
class PalindromeService {

    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}