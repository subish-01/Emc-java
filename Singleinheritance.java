class Animal
{
	void eat()
	{
		System.out.println("All animals can eat");						//super class
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("All dogs can bark");        			//derived class
	}
}
public class Singleinheritance 
{
	public static void main(String[] args)
	{
		Dog obj = new Dog();
		obj.eat();
		obj.bark();
	}
}

