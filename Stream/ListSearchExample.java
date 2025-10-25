import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class ListSearchExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Example 1: Check if a list contains a specific element
        boolean containsBob = names.contains("Bob");
        System.out.println("Does the list contain Bob? " + containsBob); // Output: true

        // Example 2: Check if any element satisfies a condition
        boolean anyStartsWithA = names.stream().anyMatch(name -> name.startsWith("A"));
        System.out.println("Does any name start with 'A'? " + anyStartsWithA); // Output: true

        // Example 3: Check if all elements satisfy a condition
        boolean allLengthGreaterThan3 = names.stream().allMatch(name -> name.length() > 3);
        System.out.println("Are all names longer than 3 characters? " + allLengthGreaterThan3); // Output: true

        // Example 4: Check if no elements satisfy a condition
        boolean noneStartsWithZ = names.stream().noneMatch(name -> name.startsWith("Z"));
        System.out.println("Does no name start with 'Z'? " + noneStartsWithZ); // Output: true

        // Example 5: Find the first element that satisfies a condition
        Optional<String> firstLongName = names.stream().filter(name -> name.length() > 5).findFirst();
        firstLongName.ifPresent(name -> System.out.println("First name longer than 5 characters: " + name)); // Output: Charlie

        // Example 6: Find any element that satisfies a condition (useful in parallel streams)
        Optional<String> anyNameWithE = names.stream().filter(name -> name.contains("e")).findAny();
        anyNameWithE.ifPresent(name -> System.out.println("Any name containing 'e': " + name)); // Output: Alice (or Eve, depending on execution)

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example 7: Find the first even number
        Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        firstEven.ifPresent(n -> System.out.println("First even number: " + n)); // Output: 2
        
    }

}
