class Animal
{
    String Name;
    int age;
    void makesound()
    {
        System.out.println("Animals makes a sound");
    }
}
class Dog extends Animal
{
    String breed;
    @Override
    void makesound() 
    {
        System.out.println("Dog barks");
    }
    void fetch()
    {
        System.out.println("Dog is fetching");
    }
}
class Cat extends Animal
{
    String colour;
    @Override
    void makesound() 
    {
        System.out.println("Cat meows");
    }
    void climb()
    {
        System.out.println("Cat is climbing");
    }
}


public class Zoo 
{
    public static void main(String[] args)
    {

        //DOG PROPERTIES
        Dog ob1 = new Dog();
        ob1.Name = "Bujji";
        ob1.age = 5;
        ob1.makesound();
        ob1.breed = "German shepherd";
        ob1.fetch();
        

        //CAT PROPERTIES
        Cat ob2 = new Cat();
        ob2.Name = "pinky";
        ob2.age = 2;
        ob2.makesound();
        ob2.climb();
        ob2.colour = "White";
    }
}
