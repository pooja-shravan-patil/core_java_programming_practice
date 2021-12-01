//Initializing object through method
package com.classandobject;

class StudentRecord
{
	int id;
	String name;
	void insertRecord(int i,String nm)
	{
		id = i;
		name = nm;
	}
	void displayRecord()
	{
		System.out.println(id+" "+name);
	}
}
public class StudentTest2 {

	public static void main(String[] args) {
		StudentRecord sr = new StudentRecord();
		sr.insertRecord(101, "Alice");
		sr.displayRecord();

	}

}
