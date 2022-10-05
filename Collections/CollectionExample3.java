import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample3 
{
    /* 
     * Collection in Java
     */
    
    public static void main(String args[])
    {
        System.out.println("Java Collections");

        Collection<String> values = new ArrayList<>();
        values.add("Hello");
        values.add("Hi");
        values.add("Hey");

        /* 
         * Fetching Collection values--
         * 1. By using Iterator interface
         * 2. By enhanced for loop
         */
        Iterator iterator = values.iterator();//It is avery old technique
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        values.remove("Hi");
        // Enhanced for loop
        for(String str: values) {
            System.out.println(str);
        }
        
    }
}
