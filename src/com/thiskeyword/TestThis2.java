//this invokes current class method
package com.thiskeyword;

public class TestThis2 {
	void show()
	{
		System.out.println("Inside show method");
	}
	void display()
	{
		System.out.println("Inside display method");
		this.show();
	}

	public static void main(String[] args) {
		TestThis2 t = new TestThis2();
		t.display();

	}

}
