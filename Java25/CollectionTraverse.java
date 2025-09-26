package Java25;

import java.util.ArrayList;
import java.util.List;

public class CollectionTraverse {
    public static void main(String args[]) {
        System.out.println("Java 25 Features");
        System.out.println("Collection Traverse in Java: Get First and Last Element of a List");
        List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "David", "Eve"));
        System.out.println("Original List " + names);
        System.out.println("First " + names.getFirst());
        System.out.println("Last " + names.getLast());
        System.out.println("Reversed List" + names.reversed());
    }
}
