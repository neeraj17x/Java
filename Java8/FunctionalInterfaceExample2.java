


public class FunctionalInterfaceExample2 {
    public static void main(String[] args) {
        // Using lambda to implement the functional interface
        MyFunctionalInterface myFunc = (message) -> System.out.println(message);
        
        myFunc.myMethod("Hello, world!");  // Output: Hello, world!
        
        // Calling default method
        myFunc.defaultMethod();  // Output: This is a default method.
        
        // Calling static method
        MyFunctionalInterface.staticMethod();  // Output: This is a static method.
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    // Single abstract method
    void myMethod( String message);

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
