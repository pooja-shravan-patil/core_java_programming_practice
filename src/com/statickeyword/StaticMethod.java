package com.statickeyword;
class StudentTest
{
	int id;
	String name;
	static String clgname = "CSIBER";
	
	StudentTest(int i,String n)
	{
		id = i;
		name = n;
	}
	static void change()
	{
		clgname = "Willingdon college";
	}
	void display()
	{
		System.out.println(id+" "+name+" "+clgname);
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		StudentTest st = new StudentTest(1,"Alice");
		st.change();
		st.display();
		

	}

}
