package shapepack;

import java.util.Scanner;

import shapepack.Shapes;

public class Circle extends Shapes {
	public Circle (int l) 
	{
		super.a=l;
	}
	public void printarea()
	{
		double area;
		area=3.14*super.a*super.a;
		System.out.println("The area of the circle is:"+area);
	}

}

