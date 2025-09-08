

public class SingletonDesignExample2 {
    public static void main(String[] args) {
        // Get the single instance of SingletonDesignExample1
        Singleton singleton = Singleton.getInstance();
        
        // You can now use the instance, for example:
        singleton.setRes(7);
        System.out.println("Value: " + singleton.getRes());
        
        // Since it's a Singleton, this will point to the same instance
        Singleton anotherInstance = Singleton.getInstance();
        System.out.println("Are both instances the same? " + (singleton == anotherInstance));  // Should print true

        System.out.println("Value of first instance: " + singleton.getRes());
        System.out.println("Value of second instance: " + anotherInstance.getRes());
    }
}


//  Thread safe >> synchronized
class Singleton {

    private int res;
    // Volatile keyword ensures that changes to the instance are visible to all threads
    private static volatile Singleton instance;

    private Singleton() {
        // Private constructor
    }

    public static Singleton getInstance() {
        // First check without synchronization (for performance)
        if (instance == null) {
            synchronized (Singleton.class) {
                // Double-check (to avoid synchronization once the instance is created)
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public int getRes() {
        return res;
    }
    public void setRes(int res) {
        this.res = res;
    }
}

