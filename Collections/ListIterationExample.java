import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIterationExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList( 1,2,3));

        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > 1) {
                list.remove(i);
            }
            // System.out.println(list.size() + " : " + list);
        }

        System.out.println(list);
    }

}
