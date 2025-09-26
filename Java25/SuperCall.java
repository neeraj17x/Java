
class Parent {
    public Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Before calling super()");   // Not allowed before Java 25
        super(); // Calls the constructor of the Parent class | it is called by default also
        System.out.println("Child constructor called");
    }

}

public class SuperCall {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
