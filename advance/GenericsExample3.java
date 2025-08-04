public class GenericsExample3 {
    // Generic method to find the maximum of three comparable objects
    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        // Test with Integers
        Integer maxInt = findMax(10, 5, 20);
        System.out.println("Max Integer: " + maxInt);

        // Test with Doubles
        Double maxDouble = findMax(3.14, 2.71, 1.618);
        System.out.println("Max Double: " + maxDouble);

        // Test with Strings
        String maxString = findMax("Apple", "Orange", "Banana");
        System.out.println("Max String: " + maxString);
    }

}
