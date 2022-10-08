import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample2 {
    public static void main(String args[])
    {
       List<Integer> list = Arrays.asList(34, 28, 46, 67);
      
       //list.forEach(null);
       list.forEach(i -> System.out.println(i));// -> Lambda Expression (Using Consumer interface)

       //Consumer<Integer> c = new ConsumerImpl();
       //list.forEach(c);

       //Creates unnecessary inner class file
       /* Consumer<Integer> con = new Consumer<Integer>() {
        public void accept(Integer i) {
            System.out.println("Number= "+ i);
        }
       };
       list.forEach(con); */
       //OR
       Consumer<Integer> con2 = (i) -> System.out.println("Number= "+ i);
       list.forEach(con2);
       //OR
       list.forEach((i) -> System.out.println("Number= "+ i));
    }
}

// class ConsumerImpl implements Consumer<Integer>
// {
//     public void accept(Integer i)
//     {
//         System.out.println("Number= "+ i);
//     }
// }