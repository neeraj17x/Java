import java.util.Scanner;
public class LinearSearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
        sc.close();
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
