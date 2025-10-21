public class MaxBalancedString {
    public int maxBalancedStringSplit(String s) {
        int balance = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MaxBalancedString solution = new MaxBalancedString();

        // Test cases
        String s1 = "RLRRLLRLRL";
        System.out.println("Max balanced string splits for '" + s1 + "': " + solution.maxBalancedStringSplit(s1)); // Expected: 4

        String s2 = "RLLLLRRRLR";
        System.out.println("Max balanced string splits for '" + s2 + "': " + solution.maxBalancedStringSplit(s2)); // Expected: 3

        String s3 = "LLLLRRRR";
        System.out.println("Max balanced string splits for '" + s3 + "': " + solution.maxBalancedStringSplit(s3)); // Expected: 1

        String s4 = "RLRRRLLRLL";
        System.out.println("Max balanced string splits for '" + s4 + "': " + solution.maxBalancedStringSplit(s4)); // Expected: 2

        String s5 = "LR";
        System.out.println("Max balanced string splits for '" + s5 + "': " + solution.maxBalancedStringSplit(s5)); // Expected: 1

        String s6 = "";
        System.out.println("Max balanced string splits for '" + s6 + "': " + solution.maxBalancedStringSplit(s6)); // Expected: 0
    }

}
