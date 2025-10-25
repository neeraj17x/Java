package ExceptionHandling;

public class ExceptionExample2 {

    public static void main(String[] args) {
        int result = exceptionTest();
        System.out.println(result);

        int result2 = testMethod();
        System.out.println(result2);

        System.out.println("Program continues after exception handling.");
    }

    public static int exceptionTest() {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
            return result;
        } finally {
            System.out.println("Finally !......");
            // return 10;

        }
        // return 12;
    }

    public static int testMethod() {
        try {
            System.out.println("In try block");
            return 1;  // The method will return 1 from here
        } finally {
            System.out.println("In finally block");
            return 2;  // This will override the return value from the try block
        }
    }
}
