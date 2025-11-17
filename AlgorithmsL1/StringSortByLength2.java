import java.util.Arrays;

// Using Functional Interface
interface FunctionalInterface {
    public String[] sortByLength(String[] arr);
}

public class StringSortByLength2 {
    public static void main(String[] args) {
        FunctionalInterface sorter = (arr) -> {
            Arrays.sort(arr, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
            return arr;
        };

        String[] words = {"bat", "pineapple", "kiwi", "hippopotamus", "grape"};
        System.out.println("Original array: " + Arrays.toString(words));

        String[] sortedWords = sorter.sortByLength(words);
        System.out.println("Sorted by length: " + Arrays.toString(sortedWords));

        String[] sentences = {"The quick brown fox", "jumped over", "the lazy dog"};
        System.out.println("Original array: " + Arrays.toString(sentences));

        String[] sortedSentences = sorter.sortByLength(sentences);
        System.out.println("Sorted by length: " + Arrays.toString(sortedSentences));

        String[] emptyAndNull = {"a", "", "bbb", "cc"};
        System.out.println("Original array: " + Arrays.toString(emptyAndNull));
        String[] sortedEmptyAndNull = sorter.sortByLength(emptyAndNull);
        System.out.println("Sorted by length: " + Arrays.toString(sortedEmptyAndNull));
    }


}
