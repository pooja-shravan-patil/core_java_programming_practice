//Default constructor display the default value.
package com.constructor;

public class TestStudent {

	int id;
	String name;

	TestStudent() {

	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		TestStudent st = new TestStudent();
		st.display();
	}

}
