public class PalindromeCheckerApp_135 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 11.0");
        System.out.println("System initialized successfully..");

        String input = "racecar";
        PalindromeCheckerApp app = new PalindromeCheckerApp();
        boolean result = app.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    public boolean checkPalindrome(String input) {
        // Initialize pointers from image hint
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
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
