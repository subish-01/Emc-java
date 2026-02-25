public class ConstOverloading 
{

    String name;
    int age;

    ConstOverloading(String name)
    {
        this.name = name;
    }
    ConstOverloading(int age)
    {
        this.age = age;
    }
    public static void main(String[] args) 
    {
        ConstOverloading obj1 = new ConstOverloading("Kumar");
        ConstOverloading ob2 = new ConstOverloading(23);
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(ob2.age);
    }
}
