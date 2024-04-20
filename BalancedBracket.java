import java.util.Stack;

public class BalancedBracket {

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return "NO";
                }
                char opening = stack.pop();
                if ((c == ')' && opening != '(') || (c == ']' && opening != '[') || (c == '}' && opening != '{')) {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        String s1 = "{ [ ( ) ] }";
        String s2 = "{ [ ( ] ) }";
        String s3 = "{ ( ( [ ] ) [ ] ) [ ] }";

        System.out.println("Output sampel 1: " + isBalanced(s1)); // Output: YES
        System.out.println("Output sampel 2: " + isBalanced(s2)); // Output: NO
        System.out.println("Output sampel 3: " + isBalanced(s3)); // Output: YES
    }
}
