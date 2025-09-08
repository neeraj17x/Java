import java.util.*;

public class CollectionExample4 {
    public static void main(String[] args) {
        // Create a immutable list of names
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        // List<String> names = new ArrayList<>();
        // names.add("Frank");
        // System.out.println("Names: " + names);
        for(String name : names) {
            System.out.println(name);
        }
    }

}
