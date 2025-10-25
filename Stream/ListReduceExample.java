import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListReduceExample {
    public static void main(String[] args) {
        // Example 1: Summing a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // int sum = numbers.stream().reduce(0, Integer::sum);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of numbers: " + sum); // Output: 15

        // Example 2: Finding the product of a list of integers
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product of numbers: " + product); // Output: 120

        // Example 3: Concatenating strings
        List<String> words = Arrays.asList("Hello", " ", "World", "!");
        String combinedString = words.stream().reduce("", (a, b) -> a + b);
        System.out.println("Combined string: " + combinedString); // Output: Hello World!

        // Example 4: Finding the maximum element
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        max.ifPresent(m -> System.out.println("Maximum number: " + m)); // Output: 5

        // Example 5: Finding the minimum element
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        min.ifPresent(m -> System.out.println("Minimum number: " + m)); // Output: 1

        // Example 6: Using a custom accumulator for a more complex reduction
        // Sum of squares
        // int sumOfSquares = numbers.stream().reduce(0, (accumulator, element) -> accumulator + (element * element), (a, b) -> a + b);     // For parallel streams
        int sumOfSquares = numbers.stream().reduce(0, (accumulator, element) -> accumulator + (element * element));
        System.out.println("Sum of squares: " + sumOfSquares); // Output: 55 (1*1 + 2*2 + 3*3 + 4*4 + 5*5)

        int sumOfCubes = numbers.stream().reduce(0, (accumulator, element) -> accumulator + (element * element * element), (a, b) -> a + b);
        System.out.println("Sum of cubes: " + sumOfCubes); // Output: 225
    }

}
