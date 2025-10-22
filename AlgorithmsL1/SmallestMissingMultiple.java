import java.util.HashSet;
import java.util.Set;

public class SmallestMissingMultiple {
    public static void main(String[] args) {
        int nums[] = {8,2,3,4,6};
        int k = 2;
        System.out.println(missingMultiple(nums, k));
        System.out.println(missingMultiple2(nums, k));

        int nums2[] = {1,4,7,10,15};
        int k2 = 5;
        System.out.println(missingMultiple(nums2, k2));
        System.out.println(missingMultiple2(nums2, k2));
    }

    public static int missingMultiple(int[] nums, int k) {
        int m = k;
        Set<Integer> multipleSet = new HashSet<>();
        for (int num : nums) {
            if(num % k ==0) {
                multipleSet.add(num);
            }
        }
        while(multipleSet.contains(m)) {
            m += k;
        }
        return m;
    }

    public static int missingMultiple2(int[] nums, int k) {
        int m = k;
        for (m=k; m<=100;m+=k) {
            int found = 0;
            for (int num : nums) {
                if(m == num) {
                    found=1;
                    break;
                }
            }
            if(found == 0) {
                break;
            }
        }
        return m;
    }

}
