import java.util.Arrays;

public class ArrayMatch1 {

    public static void main(String[] args) {
        int[] target = {3, 1, 4, 1, 5}; //{1,2,3,2,1}{3,1,1,2}
        // System.out.println(minNumberOperations(target));
        System.out.println(minNumberOperations2(target));
    }

    // Brute Force >> O(n^2)
    public static int minNumberOperations(int[] target) {
        int arrayLen = target.length;
        int count = 0;
        int initial[] = new int[arrayLen];
        while(!Arrays.equals(target, initial)) {
            int targetIndex = 0;
            for (int i=0; i<arrayLen; i++) {
                if(target[i] != initial[i] && (targetIndex == 0 || targetIndex == i)) {
                    initial[i]++;
                    targetIndex = i+1;
                }
            }
            count++;
        }
        return count;
    }

    // Optimized O(n)
    public static int minNumberOperations2(int[] target) {
        int arrayLen = target.length;
        int count = 0;
        int prev = 0; // Track the previous value to calculate the increment

        // Traverse the target array and calculate the minimum number of operations
        for (int i = 0; i < arrayLen; i++) {
            // The difference between the target[i] and prev gives us how many operations to increment
            if (target[i] > prev) {
                count += target[i] - prev;
            }
            // Update prev to the current target value
            prev = target[i];
        }
        return count;
    }
}

