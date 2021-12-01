package com.inheritance;

class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		dog d = new dog();
		d.eat();
		d.bark();

	}

}
