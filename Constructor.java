public class Constructor
{

    String Name;
    int age;

    Constructor()
    {
        Name = "Null";
    }



    public static void main(String[] args)
    {
        Constructor obj = new Constructor();             //constructor class
        obj.Name = "Hari";
        obj.age = 20;
        System.out.println(obj.Name);
        System.out.println(obj.age);

    }
}
