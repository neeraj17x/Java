
interface LambdaInterface1
{
    void show(String name);
}
// class C implements A
// {
//     public void show()
//     {
//         System.out.println("Class");
//     }
// }


public class LambdaExpression1 
{
    public static void main(String args[])
    {
        // Old type
        // A obj = new C();
        // obj.show();

        // New type
        // LambdaInterface1 obj2 = new LambdaInterface1() {
        //     public void show() {
        //         System.out.println("Anonymous Inner Class");
        //     }
        // };
        // obj2.show();

        // Using Lambda Expression since Java 8 onwards >> All the following Lambda expression syntax are valid
        // LambdaInterface1 object = () -> {};  //OK
        // LambdaInterface1 obj3 = () -> {System.out.println("lambda Expression");};   //OK
        // LambdaInterface1 obj3 = (String name) -> System.out.println("Welcome "+ name +"\nInside Lambda Expression");   //OK
        // LambdaInterface1 obj3 = (name) -> System.out.println("Welcome "+ name +"\nInside Lambda Expression");   //OK
        LambdaInterface1 obj3 = name -> System.out.println("Welcome "+ name +"\nInside Lambda Expression");   //OK
        obj3.show("Neeraj");
    }
}
