package Java25;

public class UnnamedVar {
    public static void main() {
        int num = 0;
        System.out.println("Java 25 Features");
        System.out.println("Unnamed Variables in Java!");
        try {
            num = Integer.parseInt("45A");
            // System.out.println("Output : "+ num);
        } catch(Exception _) {
            // System.out.println("Invalid number error :" + ex.getMessage());
            System.out.println("Invalid number error :");
        }
        System.out.println("Output : "+ num);
    }

}
