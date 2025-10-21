public class AbstractClassExample1 {
    public static void main(String[] args) {
        // You cannot instantiate an abstract class directly
        // Hello hello = new Hello(); // This would cause a compilation error

        // You must create a concrete subclass and instantiate that
        ConcreteHello concreteHello = new ConcreteHello();
        concreteHello.sayHello();
        concreteHello.sayGoodbye();
    }
}

abstract class Hello {
    // Abstract method (no body)
    public abstract void sayHello();

    // Concrete method (with body)
    public void sayGoodbye() {
        System.out.println("Goodbye from Hello abstract class!");
    }
}

class ConcreteHello extends Hello {
    @Override
    public void sayHello() {
        System.out.println("Hello from ConcreteHello class!");
    }

}
