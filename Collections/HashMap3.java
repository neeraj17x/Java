import java.util.Map;
import java.util.HashMap;

public class HashMap3 {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs
        ages.put("Alice", 30);
        ages.put("Bob", 24);
        ages.put("Charlie", 35);

        System.out.println("HashMap: " + ages); // Output: HashMap: {Bob=24, Alice=30, Charlie=35}

        // Accessing values
        int alicesAge = ages.get("Alice");
        System.out.println("Alice's age: " + alicesAge); // Output: Alice's age: 30

        // Checking if a key exists
        boolean containsBob = ages.containsKey("Bob");
        System.out.println("Contains Bob? " + containsBob); // Output: Contains Bob? true

        // Checking if a value exists
        boolean contains35 = ages.containsValue(35);
        System.out.println("Contains age 35? " + contains35); // Output: Contains age 35? true

        // Updating a value
        ages.put("Bob", 25);
        System.out.println("Updated HashMap: " + ages); // Output: Updated HashMap: {Bob=25, Alice=30, Charlie=35}

        // Removing a key-value pair
        ages.remove("Charlie");
        System.out.println("HashMap after removing Charlie: " + ages); // Output: HashMap after removing Charlie: {Bob=25, Alice=30}

        // Iterating through the HashMap (Entry Set)
        System.out.println("Iterating through Entry Set:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }
        // Output:
        // Iterating through Entry Set:
        // Bob is 25 years old.
        // Alice is 30 years old.

        // Iterating through keys
        System.out.println("Iterating through Key Set:");
        for (String name : ages.keySet()) {
            System.out.println(name + " is " + ages.get(name) + " years old.");
        }
        // Output:
        // Iterating through Key Set:
        // Bob is 25 years old.
        // Alice is 30 years old.

        // Iterating through values
        System.out.println("Iterating through Value Collection:");
        for (Integer age : ages.values()) {
            System.out.println("Age: " + age);
        }
        // Output:
        // Iterating through Value Collection:
        // Age: 25
        // Age: 30
    }
}
