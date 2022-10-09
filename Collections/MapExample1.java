import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class MapExample1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Neeraj");
        map.put("city", "Patna");
        map.put("year", "2022");

        System.out.println(map);
        System.out.println("Name = "+ map.get("name"));

        // Print all keys
        System.out.println(map.keySet());
        // Print all values
        System.out.println(map.values());

        // for(String value : map) {
        // }

        Map<String, String> mapTable = new Hashtable<>();//ORDERED 
        mapTable.put("element", "Nickel");
        mapTable.put("symbol", "Ni");
        mapTable.put("atmomic_number", "28");
        System.out.println("\n----------------------");
        System.out.println(mapTable);
    }
}
