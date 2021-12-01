package com.constructor;

public class TestStudent2 {
	int id;
	String name;
	TestStudent2(int i,String n)
	{
		id = i;
		name = n;
	}
	TestStudent2()
	{
		
	}
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		TestStudent2 s = new TestStudent2(1,"Alice");
		TestStudent2 s1 = new TestStudent2();
		s1.id=s.id;
		s1.name=s.name;
		s.display();
		s1.display();

	}

}
