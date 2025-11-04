import java.util.Stack;


public class BalancedParanthesis {
    public boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BalancedParanthesis solution = new BalancedParanthesis();

        // Test cases
        String s1 = "()";
        System.out.println("'" + s1 + "' is balanced: " + solution.isBalanced(s1)); // Expected: true

        String s2 = "()[]{}";
        System.out.println("'" + s2 + "' is balanced: " + solution.isBalanced(s2)); // Expected: true

        String s3 = "(]";
        System.out.println("'" + s3 + "' is balanced: " + solution.isBalanced(s3)); // Expected: false

        String s4 = "([{}])";
        System.out.println("'" + s4 + "' is balanced: " + solution.isBalanced(s4)); // Expected: true

        String s5 = "{[()]}";
        System.out.println("'" + s5 + "' is balanced: " + solution.isBalanced(s5)); // Expected: true

        String s6 = "{[(])}";
        System.out.println("'" + s6 + "' is balanced: " + solution.isBalanced(s6)); // Expected: false

        String s7 = "";
        System.out.println("'" + s7 + "' is balanced: " + solution.isBalanced(s7)); // Expected: true

        String s8 = "[";
        System.out.println("'" + s8 + "' is balanced: " + solution.isBalanced(s8)); // Expected: false
    }
}
