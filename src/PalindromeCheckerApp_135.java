import java.util.Stack;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        // Create a stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack.
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp_135 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 12.0");
        System.out.println("System initialized successfully..");

        String input = "Level";
        // Handling case sensitivity as shown in the output "Level" -> true
        String normalizedInput = input.toLowerCase();

        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(normalizedInput);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}
