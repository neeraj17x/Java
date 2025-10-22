import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample1 {
    public static void main(String[] args) {
        // This file is intentionally left blank to avoid confusion with CollectionExample1.java
        // which already exists and contains similar content.
        // If you intended to add code related to the `java.util.Collections` class,
        // please specify the exact functionality you're looking for.
        System.out.println("This is a placeholder for CollectionsExample1.java");

        List<Integer> nums  = new ArrayList<>();
        nums.add(14);
        nums.add(23);
        nums.add(13);
        nums.add(33);
        nums.add(26);

        // Using Collections (Utility Class)
        Collections.sort(nums);
        System.out.println(nums);

        Collections.reverse(nums);
        System.out.println(nums);

        Collections.shuffle(nums);
        System.out.println(nums);

        int min = Collections.min(nums);
        int max = Collections.max(nums);
        System.out.println("Min: " + min + " Max: " + max);
    }
    
}
