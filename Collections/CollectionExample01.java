import java.util.*;

public class CollectionExample01
{
    public static void main(String args[])
    {
        List<Integer> num = List.of(1,4,2,7);   // Immutable List
        // num.add(55); // This not is allowed
        System.out.println(num);
        List<Integer> mutableList = new ArrayList<>(List.of(1, 4, 2, 7));
        mutableList.add(5);  // This is allowed
        System.out.println(mutableList);
        
        List<Object> mixed = new ArrayList<>(List.of(23, "Hello", 5.89));
        System.out.println(mixed);
    }
}