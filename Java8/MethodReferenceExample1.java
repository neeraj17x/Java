import java.util.Arrays;
import java.util.List;

/* 
 * Method Reference
 * -------------------
 * Passing a function in a function as a parameter
 */
public class MethodReferenceExample1 {
    public static void main(String args[])
    {
        List<String> names = Arrays.asList("Chlorine", "Florine", "Bromine", "Iodine", "Astatine");
        // names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
    }
}
