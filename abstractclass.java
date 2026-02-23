abstract class Animal
{
    String name;
    abstract void makesound();
    Animal(String name)
    {
        this.name = name;
    }
}
class Dog extends Animal
{
    @Override
    void makesound() 
    {
        System.out.println("barks");
    }
    Dog(String name)
    {
        super(name);
    }
}

class Cat extends Animal
{
    @Override
    void makesound() 
    {
        System.out.println("meow..");
    }
    Cat(String name)
    {
        super(name);
    }
}
public class abstractclass 
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Jimmy");
        System.out.println(d1.name);
        d1.makesound();
        Cat c1 = new Cat("Tinku");
        System.out.println(c1.name);
        c1.makesound();
    }
}
