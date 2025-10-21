public class MissingNumberArray {
    public int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumberArray solution = new MissingNumberArray();

        // Test cases
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number in " + java.util.Arrays.toString(nums1) + ": " + solution.findMissingNumber(nums1)); // Expected: 2

        int[] nums2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing number in " + java.util.Arrays.toString(nums2) + ": " + solution.findMissingNumber(nums2)); // Expected: 8

        int[] nums3 = {0, 1};
        System.out.println("Missing number in " + java.util.Arrays.toString(nums3) + ": " + solution.findMissingNumber(nums3)); // Expected: 2

        int[] nums4 = {0};
        System.out.println("Missing number in " + java.util.Arrays.toString(nums4) + ": " + solution.findMissingNumber(nums4)); // Expected: 1
    }

}
