package com.aggregation;

public class Employee {

	int id;
	String name;
	Address address;
	Employee(int id,String name,Address address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		Address a = new Address("Pune","Maharashtra","India");
		Employee emp = new Employee(1,"Alice",a);
		emp.display();
	}

}
