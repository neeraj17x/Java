import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample2 {
    public static void main(String[] args) {
        // Stream API examples will be added here
        // List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> nums = Arrays.asList(24,5,19,12,9,16);

        // Stream
        Stream<Integer> stream = nums.stream();

        // nums.stream().forEach(System.out::println); // Single Thread
        // nums.parallelStream().forEach(System.out::println); // Using multiple threads

        System.out.println("----------------------------------");

        // stream.forEach(n -> System.out.println(n));
        // stream.forEach(System.out::println);      // Stream data can be used only once.

        System.out.println("----------------------------------");

        // Count elements
        System.out.println("Stream count: " + stream.count());
        System.out.println("----------------------------------");

        // Sorting
        // Stream<Integer> sortedStream = stream.sorted();
        // sortedStream.forEach(System.out::println);
        System.out.println("----------------------------------");

        // Mapping
        // Stream<Integer> mappedStream = stream.map(n -> n*3);
        // mappedStream.forEach(System.out::println);
        System.out.println("----------------------------------");

        // Filtering
        // Stream<Integer> filteredStream = stream.filter(n -> n%2 == 0);
        // filteredStream.forEach(System.out::println);
        System.out.println("----------------------------------");

        // All in One
        // nums.stream().filter(n-> n%2 == 1).sorted().map(n-> n*3).forEach(System.out::println);

        // Stream<Integer> stream2 = nums.stream().filter(n-> n%2 == 1).sorted().map(n-> n*3);
        // stream2.forEach(System.out::println);
        System.out.println("----------------------------------");

        // Include Reduce
        int res = nums.stream().filter(n-> n%2 == 1).sorted().map(n-> n*3).reduce(0,(c,e) -> c+e);
        System.out.println(res);


    }
}
