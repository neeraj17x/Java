// package Collections;

import java.util.*;
public class ArrayList1
{
    public static void main(String[] args)
    {
        ArrayList<String> name = new ArrayList<String>(List.of("Neeraj", "Anjani", "Sonu", "Anjali"));
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
        // Array methods
        System.out.println(name.size());
        System.out.println(name.contains("Sonu"));
        System.out.println(name.isEmpty());
        System.out.println(name.indexOf("Anjan"));
        System.out.println(name.lastIndexOf("Anjan"));
        System.out.println(name.get(3));
        name.remove(3);
        System.out.println(name);
    }
}
