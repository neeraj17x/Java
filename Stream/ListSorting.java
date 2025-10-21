import java.util.Comparator;
import java.util.List;

public class ListSorting {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Tobey", "Charlie", "David", "Eve");
        System.out.println("Original List: " + names);
        List<String> sortedNames = names.stream().sorted().toList();
        System.out.println("Sorted List: " + sortedNames);
        // List<String> reversedNames = names.stream().sorted((a, b) -> b.compareTo(a)).toList();
        List<String> reversedNames = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Reversed List: " + reversedNames);
    }

}
