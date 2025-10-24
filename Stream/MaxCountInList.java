// import java.util.Collections;
import java.util.List;

public class MaxCountInList {
    public static void main(String[] args) {
        List<Integer> nums = List.of(33, 9, 14, 28, 12, 28, 23, 33, 12);
        nums.stream().max(Integer::compareTo).ifPresent(System.out::println);
        nums.stream().min(Integer::compareTo).ifPresent(System.out::println);

        int max = nums.stream().max(Integer::compareTo).get();
        // int max = Collections.max(nums);
        System.out.println("Max: " + max);


        // List<Integer> maxList = nums.stream().filter(n -> n == nums.stream().max(Integer::compareTo).get()).toList();
        List<Integer> maxList = nums.stream().filter(n -> n == max).toList();
        System.out.println(maxList);
    }

}
