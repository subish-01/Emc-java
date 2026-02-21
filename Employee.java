class Person
{
    String name;
    Person(String name)
    {
        this.name = name;
    }
}
class employee extends Person
{
    int employee_id = 12;
    employee()
    {
        super("Hari");
    }
    void display()
    {
        System.out.println("Employee id is "+employee_id);
        System.out.println(name);
    }
}
public class Employee 
{
    public static void main(String[] args)
    {
        employee obj = new employee();
        obj.display();
    }
}
