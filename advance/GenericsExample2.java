public class GenericsExample2 {
    // Generic method to print elements of an array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create arrays of different types
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World", "Generics"};
        Double[] doubleArray = {1.1, 2.2, 3.3};

        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("String Array: ");
        printArray(stringArray);

        System.out.print("Double Array: ");
        printArray(doubleArray);
    }

}
