import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        // String str = "Neeraj";
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char rep = firstRepeatingCharacter(str);
        System.out.println("First repeating character by Set: " + rep);
        rep = firstRepeatingCharacterByAscii(str);
        System.out.println("First repeating character by ASCII value: " + rep);
        scan.close();
    }

    private static char firstRepeatingCharacter(String str) {
        Set<String> chars = new HashSet<>();
        char rep = ' ';
        for (char ch : str.toCharArray()) {
            if(chars.contains(String.valueOf(ch))) {
                rep = ch;
                break;
            }
            chars.add(String.valueOf(ch));
        }
        return rep;
    }

    private static char firstRepeatingCharacterByAscii(String str) {
        char rep = ' ';
        int[] charCounts = new int[256]; // Assuming ASCII characters

        for (char ch : str.toCharArray()) {
            charCounts[ch]++;
        }

        for (char ch : str.toCharArray()) {
            if (charCounts[ch] > 1) {
                rep = ch;
                break;
            }
        }
        return rep;
    }

    @SuppressWarnings("unused")
    private static char firstRepeatingCharacterByStream(String str) {
        Set<Character> seenChars = new HashSet<>();
        
        // Stream the characters, and find the first one that is already in seenChars
        return str.chars()
                  .mapToObj(c -> (char) c)  // Convert each int (char value) to Character
                  .filter(c -> !seenChars.add(c))  // filter the first duplicate
                  .findFirst()  // Find the first repeating character
                  .orElse('\0');  // Return '\0' if no repetition is found
    }

}
