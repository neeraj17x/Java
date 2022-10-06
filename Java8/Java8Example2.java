package Java8;

public class Java8Example2 {
    /* 
     * Java 8 Features
     * ---------------------
     * 1. Default method
     * 2. Static methods
     */

    public static void main(String args[])
    {
       System.out.println("Java 8 Features");
       Phone phone = new Nokia();
       phone.call();
    }
}


interface Phone
{
    public void call();

    /* 
     * Default Methods of an interface
     * -----------------------------------------
     * Suppose a developer creates a Java application by implementing an interface from the Java Library in their user defined class
     * Now in the user defined class all the abstract methods of the library interface must be defined
     * But some later versions of Java try to introduce some more abstract methods in the given library interface
     * Now the developer has to modify the source code as every abstract method of an interface must be implemented in the implementin class
     * To overcome this complexity java intoduced default methods in interfaces which can be defined and need not be overodden by the implementing class
     */
    public default void message()
    {
        System.out.println("Sending message...");
    }
}

class Nokia implements Phone
{
    public void call()
    {
        System.out.println("Calling from Nokia");
    }
}