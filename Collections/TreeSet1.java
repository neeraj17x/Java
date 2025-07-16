// package collections;

import java.util.TreeSet;

public class TreeSet1
{
    public static void main(String[] args)
    {
        TreeSet<String> name =  new TreeSet<String>();
        name.add("Neeraj");
        name.add("Anjani");
        name.add("Sonu");
        name.add("Anjani");
        // System.out.println(name.get(1));
        System.out.println(name);
        System.out.println(name.contains("Sonu"));
    }
}
