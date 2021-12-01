package com.inheritance;

class Animaldemo
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class dogdemo extends Animaldemo
{
	void bark()
	{
		System.out.println("Barking...");
	}
}
class Babydog extends dogdemo
{
	void weep()
	{
		System.out.println("Weeping...");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Babydog d = new Babydog();
		d.eat();
		d.bark();
		d.weep();

	}

}
