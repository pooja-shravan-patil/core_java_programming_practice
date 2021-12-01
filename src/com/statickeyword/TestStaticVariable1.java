package com.statickeyword;
class Student
{
	int roll_no;
	String name;
	static String college = "CSIBER";
	Student(int r,String n)
	{
		roll_no = r;
		name = n;
	}
	void display()
	{
		System.out.println(roll_no+" "+name+" "+college);
	}
}
public class TestStaticVariable1 {

	public static void main(String[] args) {
		Student s = new Student(1,"Alice");
		s.display();
	}

}
