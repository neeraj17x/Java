// package Collections;

// Defining a new Collection
class Container<T>
{
    T value;

    public void show()
    {
        System.out.println(value.getClass().getName());
        System.out.println(value);
    }
}


public class CollectionExample2
{
    public static void main(String args[])
    {
        Container<Integer> num = new Container<>();
        num.value = 24;
        num.show();

        Container<String> str = new Container<>();
        str.value = "Hello";
        str.show();
    }
}
