import java.util.Vector;

public class VectorExample1 {
    /* 
     * class Vector >> not recommended
     * Thread Safe(Synchronized) but slow
     */

    public static void main(String args[]) throws Exception
    {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("Welcome");
        // vector.add(123);

        System.out.println(vector.capacity());
        vector.add("Doctor");
        vector.add("Engineer");
        vector.add("Venus");
        vector.add("Saturn");
        vector.add("Ethane");
        vector.add("Mercury");
        vector.add("Chlorine");
        vector.add("Hexagon");
        System.out.println(vector.capacity());//10
        vector.add("Rectange");
        System.out.println(vector.capacity());//20
        vector.remove("Ethane");
        System.out.println(vector.capacity());//20

        for(Object obj: vector) {
            System.out.println(obj);
        }
    }
}
