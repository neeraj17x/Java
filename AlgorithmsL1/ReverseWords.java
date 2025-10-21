public class ReverseWords {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        if (s.isEmpty()) {
            return "";
        }

        // Split the string by one or more spaces
        String[] words = s.split("\\s+");

        // Reverse the array of words
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i > 0) {
                reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        ReverseWords solution = new ReverseWords();

        // Test cases
        String s1 = "the sky is blue";
        System.out.println("Original: \"" + s1 + "\"");
        System.out.println("Reversed: \"" + solution.reverseWords(s1) + "\""); // Expected: "blue is sky the"

        String s2 = "  hello world  ";
        System.out.println("Original: \"" + s2 + "\"");
        System.out.println("Reversed: \"" + solution.reverseWords(s2) + "\""); // Expected: "world hello"

        String s3 = "a good   example";
        System.out.println("Original: \"" + s3 + "\"");
        System.out.println("Reversed: \"" + solution.reverseWords(s3) + "\""); // Expected: "example good a"

        String s4 = "singleword";
        System.out.println("Original: \"" + s4 + "\"");
        System.out.println("Reversed: \"" + solution.reverseWords(s4) + "\""); // Expected: "singleword"

        String s5 = "   ";
        System.out.println("Original: \"" + s5 + "\"");
        System.out.println("Reversed: \"" + solution.reverseWords(s5) + "\""); // Expected: ""
    }

}
