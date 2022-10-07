import java.util.Arrays;
import java.util.List;

public class ForEachExample1
{
    public static void main(String args[])
    {
       List<Integer> list = Arrays.asList(34, 28, 46, 67);
       System.out.println(list.get(2));
       /* list.add(123);
       System.out.println(list.get(3)); */

       //External Collection Loops-----------------------
       System.out.println("\n");
       for(int i=0; i<list.size(); i++) {
        System.out.println(list.get(i));
       }

       System.out.println("\n");
       for(int i : list) {
        System.out.println(i);
       }
       //---------------------------------------

       //Internal Collection Loops From Java 8
       System.out.println("\n");
       list.forEach(i -> System.out.println(i));// -> Lambda Expression (Using Consumer interface)
    }
}
