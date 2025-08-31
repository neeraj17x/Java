public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {
        // Using a lambda expression to implement the MyFunctionalInterface
        MyFunctionalInterface func = (a, b) -> System.out.println("Sum: " + (a + b));
        func.performAction(10, 20);

        // Another example with a different lambda
        MyFunctionalInterface func2 = (x, y) -> {
            int product = x * y;
            System.out.println("Product: " + product);
        };
        func2.performAction(5, 7);
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    void performAction(int a, int b);
    // void anotherMethod(); // Uncommenting this would make it not a functional interface

}

// Output:
// Sum: 30
// Product: 35
