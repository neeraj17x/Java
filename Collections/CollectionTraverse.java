public class CollectionTraverse {
    public static void main(String[] args) {
        // Creating a list of strings
        java.util.List<String> names = new java.util.ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Enhanced for loop (forEach loop)
        System.out.println("Traversing with enhanced for loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // Using an Iterator
        System.out.println("\nTraversing with Iterator:");
        java.util.Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using forEach method with a lambda expression (Java 8+)
        System.out.println("\nTraversing with forEach method (lambda):");
        names.forEach(name -> System.out.println(name));

        // Using forEach method with method reference (Java 8+)
        System.out.println("\nTraversing with forEach method (method reference):");
        names.forEach(System.out::println);

        // Traditional for loop with index
        System.out.println("\nTraversing with traditional for loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
