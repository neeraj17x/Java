import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;


public class MapExample1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Neeraj");
        map.put("city", "Patna");
        map.put("year", "2022");
        map.put("year", "2025"); //overwrite

        System.out.println(map);
        System.out.println("Name = "+ map.get("name"));

        // Print all keys
        System.out.println("HashMpa keys:");
        System.out.println(map.keySet());
        // Print all values
        System.out.println("HashMap values");
        System.out.println(map.values());

        // Iteration of HashMap
        System.out.println("-----------------------------");
        map.forEach((key, value) -> {
            System.out.println(key+" => "+value);
        });


        // TreeMap >> Ordered by key
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("name", "Anjali");
        treeMap.put("city", "Nalanda");
        treeMap.put("year", "2024");
        System.out.println("\n----------------------");
        System.out.println(treeMap);


        // Legacy code support
        // Hashtable is ordered 
        Map<String, String> mapTable = new Hashtable<>();//ORDERED 
        mapTable.put("element", "Sodium");
        mapTable.put("symbol", "Na");
        mapTable.put("atmomic_number", "11");
        System.out.println("\n----------------------");
        System.out.println(mapTable);
    }
}
