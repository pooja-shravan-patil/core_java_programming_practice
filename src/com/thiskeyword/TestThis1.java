//this invokes current class instance variable
package com.thiskeyword;
class Student
{
	int roll_no;
	String name;
	float fee;
	
	Student(int roll_no, String name, float fee)
	{
		this.roll_no = roll_no;
		this.name = name;
		this.fee = fee;
	}
	void display()
	{
		System.out.println(roll_no+" "+name+" "+fee);
	}
}
public class TestThis1 {

	public static void main(String[] args) {
		Student s = new Student(111,"Alice",5000f);
		Student s2 = new Student(112,"Bob",6000f);
		s.display();
		s2.display();

	}

}
