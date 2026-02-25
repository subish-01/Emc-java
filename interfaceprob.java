interface Animal
{
    int age = 20;
    void sound();
    
}
class Dog implements Animal
{
    @Override
    public void sound() 
    {
        System.out.println("BOW BOW");
    }
}
public class interfaceprob 
{
    public static void main(String[] args)
    {
        Dog obj = new Dog();
        obj.sound();
        System.out.println(obj.age);
    }
}
