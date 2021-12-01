//constructor overloading by changing the number of parameters.
package com.constructor;

public class TestStudentOverload {
	int id;
	String name;
	int age;
	TestStudentOverload(int i,String n)
	{
		id = i;
		name = n;
	}
	TestStudentOverload(int i,String n,int a)
	{
		id = i;
		name = n;
		age = a;
	}
	void show()
	{
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {
		TestStudentOverload st = new TestStudentOverload(101, "Bob");
		TestStudentOverload st1 = new TestStudentOverload(102, "Alice", 26);
		st.show();
		st1.show();

	}

}
