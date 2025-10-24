

import java.util.Comparator;
import java.util.List;

public class SortingByLength {
    public static void main(String[] args) {
        List<String> names = List.of("Anthony", "Tobey", "Charles", "Daniel", "Eve");
        System.out.println("Original List: " + names);

        // List<String> sortedNames = names.stream().sorted((a, b) -> a.length() - b.length()).toList();
        List<String> sortedNames = names.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println("Sorted List: " + sortedNames);
    }

}
