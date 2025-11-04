public class SortedArraysMedian1 {

    public static void main(String[] args) {
        int nums1[] = {1,2};
        int nums2[] = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num[] = mergeArray(nums1,nums2);
        int arrLen = num.length;
        double median = 0;
        if(arrLen % 2 == 0) {
            median = (double)(num[arrLen/2 - 1] + num[arrLen/2]) / 2;
        } else {
            median = num[(arrLen - 1)/2];
        }
        return median;
    }

    private static int[] mergeArray(int[] num1, int[] num2) {
        int num[] = new int[num1.length+num2.length];
        int i=0,j=0,k=0;
        while(i < num1.length && j < num2.length) {
            if(num1[i] <= num2[j]) {
                num[k] = num1[i];
                i++;
            } else {
                num[k] = num2[j];
                j++;
            }
            k++;
        }
        while(i < num1.length) {
            num[k] = num1[i];
            i++;
            k++;
        }
        while(j < num2.length) {
            num[k] = num2[j];
            j++;
            k++;
        }
        return num;
    }
}
