// package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1
{
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Neeraj");
        name.add("Anjani");
        name.add("Sonu");
        Iterator<String> it = name.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
