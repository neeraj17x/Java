package ExceptionHandling;

public class ExceptionExample1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Exception message: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }

        System.out.println("Program continues after exception handling.");

        try {
            String str = null;
            System.out.println(str.length()); // This will cause a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot perform operation on a null object.");
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Another part of the program.");
    }

}
