public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Calculate prefix products
        int prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        // Calculate suffix products and combine with prefix products
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ProductExceptSelf solution = new ProductExceptSelf();

        // Test cases
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solution.productExceptSelf(nums1);
        System.out.println("Product except self for " + java.util.Arrays.toString(nums1) + ": " + java.util.Arrays.toString(result1)); // Expected: [24, 12, 8, 6]

        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = solution.productExceptSelf(nums2);
        System.out.println("Product except self for " + java.util.Arrays.toString(nums2) + ": " + java.util.Arrays.toString(result2)); // Expected: [0, 0, 9, 0, 0]

        int[] nums3 = {5, 9, 2, 7};
        int[] result3 = solution.productExceptSelf(nums3);
        System.out.println("Product except self for " + java.util.Arrays.toString(nums3) + ": " + java.util.Arrays.toString(result3)); // Expected: [126, 70, 315, 90]
    }

}
