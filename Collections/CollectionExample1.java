// package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample1
{
    public static void main(String args[])
    {
        System.out.println("Java Object Class");
        Object object[] = new Object[5];
        object[0] = "This is a string in object";
        object[1] = 123;
        for(int i=0; i<object.length; i++) {
            System.out.println(object[i]);
        }
        System.out.println("Java Collections");

        Collection values = new ArrayList();//Raw/generic collection type, can contain any type of values
        /* 
         * Note: CollectionExample1.java uses unchecked or unsafe operations.
         * Note: Recompile with -Xlint:unchecked for details.
         */
        // values.add(123);
        // values.add(123.5);
        // values.add("Hello");

        /* 
         * Fetching Collection values--
         * 1. By using Iterator interface
         * 2. By enhanced for loop
         */
        // Iterator iterator = values.iterator();
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());

        Collection<Integer> numbers = new ArrayList<>();//Cannot use index on Collection
        numbers.add(36);
        numbers.add(8888);


        // interface List extends Collection{}
        // List can have duplicate values
        // Traverisng the elements is done in a fixed sequence
        List list = new ArrayList();
        List<Integer> numbers2 = new ArrayList<>();


        /* 
         * interface Set extends Collection{}
         * Set cannot have duplicate values
         * Traverisng the elements is done in  random order
         */
        // Set set = new HashSet();
        Set<Integer> numbers3 = new HashSet<>();
        Set<Integer> numbers4 = new TreeSet<>();//It will return elements in a sorted format


        Map genericMap = new HashMap();
        Map<String, String> map = new HashMap<>();
    }
}