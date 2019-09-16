package shapepack;

import java.util.Scanner;

import shapepack.Shapes;


public class Rectangle extends Shapes{
	public Rectangle(int l,int h)
	{
		super.a=l;
		super.b=h;
	
	}
	public void printarea() {
		double area;
		area=super.a*super.b;
		System.out.println("The area of Rectangle is:"+area);
	}
	

}
