public class PalindromeCheckerApp_135 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 10.0");
        System.out.println("System initialized successfully..");

        String input = "A man a plan a canal Panama";

        // Normalize the string: remove spaces and convert to lowercase
        String normalized = input.replace(" ", "").toLowerCase();
        boolean isPalindrome = true;

        // Use the logic provided in the hint
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
