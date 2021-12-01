//Initializing object through reference
package com.classandobject;
class Student1
{
	int id;
	String name;
}

public class StudentTest1 {

	public static void main(String[] args) {
		Student1 stu = new Student1();
		stu.id = 1;
		stu.name = "alice";
		System.out.println(stu.id+" "+stu.name);

	}

}
