// package Java8;

public class Java8Example1 {
    /* 
     * Java 8 Features
     * --------------------
     * 1. Functional Programming
     * 2. Lambda Expression
     * 3. Stream API
     * 
     * 4. We can define methods in an interface
     */

     public static void main(String args[])
     {
        System.out.println("Java 8 Features");
     }
}


interface Java8Feature1I
{
    public int add(int a, int b);
    public default void show()
    {
        System.out.println("I am defined inside an interface I");
    }
}

interface Java8Feature1J
{
    public int add(int a, int b);
    public default void show()
    {
        System.out.println("Default method- I am defined inside an interface J");
    }

    public static void display()
    {
        System.out.println("Static method- I am defined inside an interface J");
    }
}

class Java8Feature1C implements Java8Feature1I, Java8Feature1J
{
    public int add(int a, int b)
    {
        return a+b;
    }

    public void show()
    {
        System.out.println("Ambiguous Default method should be implemented in class");
        Java8Feature1J.display();   //Calling static method of an interface
    }
}