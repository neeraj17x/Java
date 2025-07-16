// package Collections;

import java.util.*;
public class ArrayList1
{
    public static void main(String[] args)
    {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Neeraj");
        name.add("Anjani");
        // System.out.println(name.get(1));
        // System.out.println(name);
        name.add("Sonu");
        System.out.println(name);
        name.add(1, "Anjali");
        System.out.println(name);
        name.set(2, "Anjan");
        System.out.println(name);
        name.remove("Sonu");
        System.out.println(name);
        name.remove(1);
        System.out.println(name);
        // name.clear();   // Remove all elements
        System.out.println(name.size());
    }
}
