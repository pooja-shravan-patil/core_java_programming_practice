package com.inheritance;

class AnimalTest
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class DogTest extends AnimalTest
{
	void bark()
	{
		System.out.println("Barking...");
	}
}
class CatTest extends AnimalTest
{
	void meow()
	{
		System.out.println("Meowing...");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		CatTest c = new CatTest();
		c.eat();
		c.meow();
		DogTest d = new DogTest();
		d.eat();
		d.bark();

	}

}
