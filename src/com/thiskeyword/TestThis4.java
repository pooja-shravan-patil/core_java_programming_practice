//calling parameterized constructor from default constructor.
package com.thiskeyword;

public class TestThis4 {
	
	TestThis4()
	{
		this(10);
		System.out.println("Welcome");
	}
	TestThis4(int n)
	{
		System.out.println(n);
	}

	public static void main(String[] args) {
		TestThis4 obj = new TestThis4();

	}

}
