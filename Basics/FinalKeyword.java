public class FinalKeyword {
    // A final variable can only be initialized once.
    // Once initialized, its value cannot be changed.
    final int MAX_VALUE = 100;

    // A final method cannot be overridden by subclasses.
    public final void display() {
        System.out.println("This is a final method.");
    }

    // A final class cannot be subclassed.
    // Uncommenting the following would cause a compilation error:
    // final class MyFinalClass {
    //     // ...
    // }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        System.out.println("MAX_VALUE: " + obj.MAX_VALUE);
        

        // obj.MAX_VALUE = 200; // This would cause a compilation error
        // System.out.println("MAX_VALUE after attempt to change: " + obj.MAX_VALUE);

        obj.display();

        final int localVar;// = 29;
        localVar = 90;
        System.out.println("localVar: " + localVar);
    }

}
