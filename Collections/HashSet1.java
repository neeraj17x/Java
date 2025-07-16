// package collections;

import java.util.HashSet;

public class HashSet1
{
    public static void main(String[] args)
    {
        HashSet<String> name =  new HashSet<String>();
        name.add("Neeraj");
        name.add("Anjani");
        name.add("Sonu");
        name.add("Anjani");
        // System.out.println(name.get(1));
        System.out.println(name);
        System.out.println(name.contains("Sonu"));
    }
}
