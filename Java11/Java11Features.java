public class Java11Features {
    public static void main(String[] args) {
        System.out.println("Java 11 Features");

        // isBlank() method
        String name = "Neeraj";
        System.out.println(name.isBlank());
        name = "";
        System.out.println(name.isBlank());
        name = " ";
        System.out.println(name.isBlank());

        // repeat() method
        name = "Hello"; // "HelloHelloHello
        System.out.println(name.repeat(3));

        // Example of new String methods in Java 11
        String str = "  Hello, World!  ";
        System.out.println(str.strip());  // "Hello, World!"
        System.out.println("  \n  ".isBlank()); // true
        System.out.println("hello\nworld".lines().count());  // 2
    }
}
