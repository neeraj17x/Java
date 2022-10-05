// package Collections;

// Defining a new Collection
class Container<T>
{
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void show()
    {
        System.out.println(value.getClass().getName());
        System.out.println(value);
    }
}

class NumberContainer<T extends Number>{
    // This container can only have Number type values, like Integer, Float, Double, etc.

    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

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

        NumberContainer<Float> num2 = new NumberContainer<>();
        num2.value = 2.5F;
        num2.show();


    }
}
