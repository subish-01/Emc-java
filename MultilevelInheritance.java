



							//ONE SUPERCLASS EXTENDED BY SUBCLASS
							//EXTENDED SUBCLASS IS EXTENDED BY ANOTHER SUBCLASS





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
public class MultilevelInheritance 
{
	public static void main(String[] args) 
	{
		Puppy obj = new Puppy();
		obj.bark();
		obj.eat();
		obj.weep();
	}

}

