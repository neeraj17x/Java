// package collections;

import java.util.HashMap;

public class HashMap1
{
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Bihar", "Patna");
        capitalCities.put("Haryana", "Chandigarh");
        System.out.println(capitalCities);
        System.out.println(capitalCities.keySet());
        System.out.println(capitalCities.values());
        System.out.println(capitalCities.get("Bihar"));
    }
}
