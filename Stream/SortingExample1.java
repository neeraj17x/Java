
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SortingExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        // List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println(sortedNumbers);
        List<Integer> distinctSortedNumbers = numbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(distinctSortedNumbers);

    }

}
