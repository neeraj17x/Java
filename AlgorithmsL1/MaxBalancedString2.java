
import java.util.HashMap;
import java.util.Map;


class Solution {
    public int longestBalanced(String s) {
        // Map<String, Integer> f = new HashMap<String, Integer>();
        int maxBalancedLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> fMap = new HashMap<Character, Integer>();
            for(int j=i;j<s.length(); j++) {
                char ch = s.charAt(j);
                fMap.put(ch, fMap.getOrDefault(ch, 0)+1);
                if(this.isBalanced(fMap)) {
                    int len = j-i+1;
                    maxBalancedLength = len > maxBalancedLength ? len : maxBalancedLength;
                }
            }
        }
        return maxBalancedLength;
    }
    public boolean isBalanced(Map<Character, Integer> fMap)
    {
        int count = -1;
        for (int f : fMap.values()) {
            if(count == -1) {
                count = f;
            } else if(count != f) {
                return false;
            }
        }
        return true;
    }
}

public class MaxBalancedString2 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        String s1 = "aabbcc";
        System.out.println("Longest balanced string for '" + s1 + "': " + sol.longestBalanced(s1)); // Expected: 6

        String s2 = "aaabbbccc";
        System.out.println("Longest balanced string for '" + s2 + "': " + sol.longestBalanced(s2)); // Expected: 9

        String s3 = "abccba";
        System.out.println("Longest balanced string for '" + s3 + "': " + sol.longestBalanced(s3)); // Expected: 6

        String s4 = "abcabc";
        System.out.println("Longest balanced string for '" + s4 + "': " + sol.longestBalanced(s4)); // Expected: 6

        String s5 = "aabbc";
        System.out.println("Longest balanced string for '" + s5 + "': " + sol.longestBalanced(s5)); // Expected: 4 (e.g., "aabb")

        String s6 = "abc";
        System.out.println("Longest balanced string for '" + s6 + "': " + sol.longestBalanced(s6)); // Expected: 0

        String s7 = "abacaba";
        System.out.println("Longest balanced string for '" + s7 + "': " + sol.longestBalanced(s7)); // Expected: 4 (e.g., "baca")

        String s8 = "";
        System.out.println("Longest balanced string for '" + s8 + "': " + sol.longestBalanced(s8)); // Expected: 0
    }

}
