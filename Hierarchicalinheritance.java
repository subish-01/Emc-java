

							//ONE PARENT CLASS AND MORE THAN ONE CHILD CLASS 

class Animal1					//PARENT CLASS
{
	void eat()				
	{
		System.out.println("All animals can eat");					
	}
}

class Dog1 extends Animal1					//ONE CHILD CLASS
{
	void bark()					//FIRST-CHILD CLASS EXTENDS PARENT CLASS
	{
		System.out.println("All dogs can bark");					
	}
}

class Cat extends Animal1					//ANOTHER CHILD CLASS
{
	void meow()					//SECOND-CHILD CLASS EXTENDS PARENT CLASS
	{
		System.out.println("Cat sounds like meow");
		
	}
}

public class Hierarchicalinheritance 
{

	public static void main(String[] args) 
	{
		Cat obj1 = new Cat();
		obj1.eat();
		obj1.meow();
		Dog1 obj2 = new Dog1();
		obj2.bark();
		obj2.eat();
	}

}
