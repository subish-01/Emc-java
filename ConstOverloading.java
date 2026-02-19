public class ConstOverloading 
{

    String name;
    int age;

    ConstOverloading(String name)
    {
        System.out.println(name);
    }
    ConstOverloading(int age)
    {
        System.out.println(age);
    }
    public static void main(String[] args) 
    {
        ConstOverloading obj1 = new ConstOverloading("Kumar");
        ConstOverloading ob2 = new ConstOverloading(23);
    }
}
