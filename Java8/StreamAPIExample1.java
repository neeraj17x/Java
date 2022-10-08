import java.util.ArrayList;
import java.util.List;

/* 
 * Learn more about Straem API
 */
public class StreamAPIExample1 {
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< 10; i++) {
            list.add(i*9+i-9);
        }

        // list.forEach(System.out:: println);
        list.stream().forEach(System.out::println);
        list.parallelStream().forEach(System.out::println);
    }
}
