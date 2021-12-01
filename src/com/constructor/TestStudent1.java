//Demonstrate copy constructor through initialize the values from one object to another object.
package com.constructor;

public class TestStudent1 {

	int id;
	String name;
	TestStudent1(int i,String n)
	{
		id = i;
		name = n;
	}
	TestStudent1(TestStudent1 t)
	{
		id = t.id;
		name = t.name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		TestStudent1 s = new TestStudent1(1,"Alice");
		TestStudent1 s2 = new TestStudent1(s);
		s.display();
		s2.display();

	}

}
