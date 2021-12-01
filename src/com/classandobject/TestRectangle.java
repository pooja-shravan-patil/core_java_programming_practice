package com.classandobject;
class Rectangle
{
	int length;
	int width;
	void takeValue(int l,int w)
	{
		length = l;
		width = w;
	}
	void claculateArea()
	{
		System.out.println(length * width);
	}
}
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.takeValue(11, 5);
		r2.takeValue(3, 15);
		
		r1.claculateArea();
		r2.claculateArea();

	}

}
