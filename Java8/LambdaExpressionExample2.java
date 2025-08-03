public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        // Lambda expression with no parameters
        Greeting greeting1 = () -> System.out.println("Hello!");
        greeting1.sayHello();

        // Lambda expression with one parameter
        GreetingWithName greeting2 = (name) -> System.out.println("Hello, " + name + "!");
        greeting2.sayHelloTo("Neeraj");

        // Lambda expression with multiple parameters and a return value
        Calculator calculator = (a, b) -> a + b;
        int result = calculator.add(5, 3);
        System.out.println("Sum: " + result);
    }
}

interface Greeting {
    void sayHello();
}

// A functional interface in Java is an interface that contains exactly one abstract method.
interface GreetingWithName {
    void sayHelloTo(String name);
    // void sayHelloTo2(String name);
}

interface Calculator {
    int add(int a, int b);

}
