import java.util.*;
import java.util.stream.Collectors;

public class ListOddEven {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9));
        // List<Integer> even = nums.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> even = nums.stream().filter(n->n%2==0).toList();
        List<Integer> odd = nums.stream().filter(n->n%2==1).collect(Collectors.toList());
        System.out.println(even);
        System.out.println(odd);
    }
}
