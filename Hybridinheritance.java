



				//combination of multilevel inheritance and hierarchical inheritance makes hybrid inheritance



class Animal
{
	void eat()
	{
		System.out.println("All animals can eat");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dogs can bark");
	}
}
class Puppy extends Dog
{
	void weep()
	{
		System.out.println("puppies can weep");
	}
}
class Cat1 extends Animal
{
	void meow()
	{
		System.out.println("All cats sounds like meow");
	}
}


public class Hybridinheritance 
{

	public static void main(String[] args) 
	{
		Cat1 obj = new Cat1();
		obj.eat();
		obj.meow();
	}

}
