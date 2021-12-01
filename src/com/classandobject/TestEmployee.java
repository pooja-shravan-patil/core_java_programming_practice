//demonstrate object and class.
package com.classandobject;

class Employee
{
	int empid;
	String name;
	float salary;
	void insertEmployee(int i,String n,float s)
	{
		empid = i;
		name = n;
		salary = s;
	}
	void DisplayEmployee()
	{
		System.out.println(empid+" "+name+" "+salary);
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.insertEmployee(101, "Alice", 25000.40f);
		emp.DisplayEmployee();

	}

}
