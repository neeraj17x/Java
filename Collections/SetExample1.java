import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {
    public static void main(String[] args) {
        Set<Integer> set =  new HashSet<>();
        set.add(47);
        set.add(90);
        set.add(23);
        set.forEach(System.out::println);

        System.out.println("\n");
        set.add(47);//Duplicate elements will be considered as single element (Same as Set Theory in Mathematics)
        set.forEach(System.out::println);

        if(!set.add(90)) {
            System.out.println("\n90 already exists in Set");
        }

        // TrreSet print the set in a ORDERED way
        Set<Integer> treeSet =  new TreeSet<>();
        treeSet.add(53);
        treeSet.add(13);
        treeSet.add(89);
        treeSet.add(41);
        System.out.println("\n");
        treeSet.forEach(System.out::println);
    }
}
