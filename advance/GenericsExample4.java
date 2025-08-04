class Generic1<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class Generic2<T, U> {
    private T value1;
    private U value2;
    public void setValue(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public U getValue2() {
        return value2;
    }
}

class Generic3<T extends Number> {
    private T value;
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class Generic4<T> {    // Generic method to print elements of an array
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

class Generic5<T extends Comparable<T>> {    // Generic method to find the maximum of two comparable objects
    public T findMax(T a, T b) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        return max;
    }
}

public class GenericsExample4 {
    public static void main(String[] args) {
        // Example usage of Generic1
        Generic1<String> gen1 = new Generic1<>();
        gen1.setValue("Hello Generics");
        System.out.println("Generic1 Value: " + gen1.getValue());

        // Example usage of Generic2
        Generic2<String, Integer> gen2 = new Generic2<>();
        gen2.setValue("Answer", 42);
        System.out.println("Generic2 Values: " + gen2.getValue1() + " and " + gen2.getValue2());

        // Example usage of Generic3 (Bounded Type Parameter)
        Generic3<Integer> gen3 = new Generic3<>();
        gen3.setValue(100);
        System.out.println("Generic3 Value: " + gen3.getValue());

        // Generic3<String> gen3Error = new Generic3<>(); // This would cause a compile-time error

        // Example usage of Generic4 (Generic Method)
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        System.out.print("Generic4 Integer Array: ");
        Generic4.printArray(intArray);
        System.out.print("Generic4 String Array: ");
        Generic4.printArray(stringArray);

        // Example usage of Generic5 (Bounded Type Parameter with Comparable)
        Generic5<Integer> gen5 = new Generic5<>();
        System.out.println("Generic5 Max (5, 10): " + gen5.findMax(5, 10));
        Generic5<String> gen5String = new Generic5<>();
        System.out.println("Generic5 Max (\"Orange\", \"Apple\"): " + gen5String.findMax("Orange", "Apple"));
    }

}
