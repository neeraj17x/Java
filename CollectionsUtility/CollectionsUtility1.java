import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CollectionsUtility1 {
    public static void main(String[] args) {
        List<Integer> nums  = new ArrayList<>(List.of(17,12,8,19,23,99,62,11));

        // Size of ArrayList
        System.out.println(nums.size());

        // Sort
        // Collections.sort(nums);
        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println(nums);

        // Reverse >> It is not sorting in Descending, it just reveres the array backwards
        Collections.reverse(nums);
        System.out.println(nums);
        
        // Shuffle
        Collections.shuffle(nums);
        System.out.println(nums);

        // Fill
        // Collections.fill(nums, 11);
        // System.out.println(nums);

        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
        System.out.println(Collections.frequency(nums, 11));


    }

}
