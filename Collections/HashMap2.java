import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "Neeraj");
        map1.put("city", "Patna");
        System.out.println(map1);
        map1.put("age", 31);
        System.out.println(map1);
        
    }
}
