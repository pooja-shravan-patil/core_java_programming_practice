package com.thiskeyword;

public class TestThis3 {
	TestThis3()
	{
		System.out.println("Inside constructor");
	}
	TestThis3(int x)
	{
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		TestThis3 ts = new TestThis3(10);
		

	}

}
