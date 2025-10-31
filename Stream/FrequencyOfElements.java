import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FrequencyOfElements {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "Alice", "David", "Bob", "Alice");

        Map<String, Long> frequencyMap = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Frequency of elements: " + frequencyMap);

        List<Integer> numbers = List.of(1, 8, 6, 23, 12, 43, 22, 23, 8, 12);
        Map<Integer, Long> frequencyMap1 = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency of elements: " + frequencyMap1);

        // Get second highest from a list
        int secondHighestNumber = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second highest number: " + secondHighestNumber);


    }

}
