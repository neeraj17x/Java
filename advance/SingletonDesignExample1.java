
public class SingletonDesignExample1 {
    public static void main(String[] args) {
        // Get the single instance of Singleton
        Singleton singleton = Singleton.getInstance();
        
        // You can now use the instance, for example:
        singleton.res = 5;
        System.out.println("Value: " + singleton.res);
        
        // Since it's a Singleton, this will point to the same instance
        Singleton anotherInstance = Singleton.getInstance();
        System.out.println("Are both instances the same? " + (singleton == anotherInstance));  // Should print true

        System.out.println("Value of first instance: " + singleton.res);
        System.out.println("Value of second instance: " + anotherInstance.res);
    }
}


/*
 * Structure of a Singleton
 * -------------------------------
 * Private Constructor: To prevent other classes from creating instances directly.
 * Static Variable: Holds the reference to the single instance of the class.
 * Static Method: Provides a way to access the instance, and initializes the instance if it hasn’t been created yet.
 */
class Singleton {
    int res;
    // Step 1: Private static variable to hold the single instance
    private static Singleton instance;

    // Step 2: Private constructor to prevent external instantiation
    private Singleton() {
        // Private constructor to restrict instantiation
    }

    // Step 3: Public static method to provide access to the single instance
    public static Singleton getInstance() {
        // Lazy initialization (instance created only when needed)
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
