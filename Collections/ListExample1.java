import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample1 {
    /* 
     * interface List Example
     */

    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Welcome");
        list.add("Apple");
        list.add(2, "List Example");

        for(String str: list) {
            System.out.println(str);
        }

        System.out.println("\n");
        Collections.sort(list);
        for(String str: list) {
            System.out.println(str);
        }

        list.remove("Apple");
        System.out.println("\nRemoving Apple");
        for(String str: list) {
            System.out.println(str);
        }


        System.out.println("\nUsing forEach");
        // Another method of iteration >> Stream API which uses Lambda expression (Introduced in Java 1.8)
        list.forEach(System.out::println);
    }
}
