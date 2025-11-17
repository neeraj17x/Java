import java.util.Arrays;

public class StringSortByLength1 {
    public static void sortStringsByLength(String[] arr) {
        // Using a custom comparator with Arrays.sort()
        // The comparator compares strings based on their lengths
        Arrays.sort(arr, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public static void sortStringsByLengthUserDefined(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "kiwi", "orange", "grape"};
        System.out.println("Original array: " + Arrays.toString(words));

        sortStringsByLength(words);
        System.out.println("Sorted by length: " + Arrays.toString(words));

        String[] sentences = {"The quick brown fox", "jumped over", "the lazy dog"};
        System.out.println("Original array: " + Arrays.toString(sentences));

        sortStringsByLength(sentences);
        System.out.println("Sorted by length: " + Arrays.toString(sentences));

        String[] emptyAndNull = {"a", "", "bbb", "cc"};
        System.out.println("Original array: " + Arrays.toString(emptyAndNull));
        sortStringsByLength(emptyAndNull);
        System.out.println("Sorted by length: " + Arrays.toString(emptyAndNull));
    }

}
