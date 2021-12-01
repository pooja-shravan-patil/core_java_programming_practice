//parameterized constructor provides different values to the object.
package com.constructor;

public class TestStudentDemo {
	int id;
	String name;
	TestStudentDemo(int i,String n)
	{
		id = i;
		name = n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		TestStudentDemo t = new TestStudentDemo(101,"Alice");
		t.display();
		

	}

}
