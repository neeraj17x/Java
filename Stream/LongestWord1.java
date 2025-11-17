import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestWord1 {
    public static void main(String[] args) {
        String sentence = "Java is a high-level, object-oriented programming language.";
        // String longestWord = findLongestWord(sentence);
        String longestWord = findLongestWordByStream(sentence);
        System.out.println("The longest word in the sentence is: " + longestWord);
    }

    public static String findLongestWord(String sentence) {
        // String[] words = sentence.split(" ");
        String[] words = sentence.trim().split("\\s+");
        // System.out.println(Arrays.toString(words));
        String longestWord = "";
        for (String word : words) {
            word = word.replaceAll(",", "");
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static String findLongestWordByStream(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        // return words.stream().max(Comparator.comparingInt(String::length)).get();
        Optional<String> longestWord = Arrays.stream(words).map(word -> word.replaceAll(",", "")).max(Comparator.comparingInt(String::length));
        if(longestWord.isPresent()) {
            return longestWord.get();
        } else {
            return "";
        }
    }

}
