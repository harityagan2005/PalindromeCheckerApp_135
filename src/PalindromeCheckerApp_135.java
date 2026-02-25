public class PalindromeCheckerApp_135 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command-line argument.");
            return;
        }

        long startTime = System.nanoTime();

        String input = args[0];
        String normalized = input.toLowerCase();
        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}
