// package collections;

import java.util.LinkedList;

public class LinkedList1
{
    public static void main(String[] args)
    {
        LinkedList<String> name = new LinkedList<String>();
        name.add("Neeraj");
        name.add("Anjani");
        // System.out.println(name.get(1));
        name.add(1, "Anjali");
        System.out.println(name);
        name.addFirst("Sonu");
        System.out.println(name);
        System.out.println(name.getLast());
        // name.clear();   // Remove all elements
        System.out.println(name.size());
    }
}
