public class ReverseVowels {
    public static String reverseVowels(String s)
    {
        if (s == null || s.length() == 0) {
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if(isVowel(chars[left])) {
                if(isVowel(chars[right])) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return new String(chars);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args)
    {
        // Test cases
        String s1 = "hello";
        System.out.println("Original: \"" + s1 + "\"");
        System.out.println("Reversed Vowels: \"" + reverseVowels(s1) + "\""); // Expected: "holle"

        String s2 = "education";
        System.out.println("Original: \"" + s2 + "\"");
        System.out.println("Reversed Vowels: \"" + reverseVowels(s2) + "\""); // Expected: "odicatuen"

        String s3 = "aA";
        System.out.println("Original: \"" + s3 + "\"");
        System.out.println("Reversed Vowels: \"" + reverseVowels(s3) + "\""); // Expected: "Aa"

        String s4 = "rhythm";
        System.out.println("Original: \"" + s4 + "\"");
        System.out.println("Reversed Vowels: \"" + reverseVowels(s4) + "\""); // Expected: "rhythm"

        String s5 = "";
        System.out.println("Original: \"" + s5 + "\"");
        System.out.println("Reversed Vowels: \"" + reverseVowels(s5) + "\""); // Expected: ""
    }
}
