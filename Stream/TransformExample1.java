package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class TransformExample1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream().map(i -> i * 2).forEach(System.out::println);

        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        // names.stream().map(String::toUpperCase).forEach(System.out::println);    // OK
        // List<String> upperCaseNames = names.stream().map(String::toUpperCase).toList();
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseNames);
    }

}
