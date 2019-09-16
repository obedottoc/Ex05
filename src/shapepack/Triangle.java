package shapepack;

import java.util.Scanner;

import shapepack.Shapes;

public class Triangle extends Shapes{
	
	public Triangle(int l, int h)
	{
		super.a=l;
		super.b=h;
	}
	public void printarea() {
		double Tri;
		Tri=0.5*super.a*super.b;
		System.out.println("The area of the triangle is:"+Tri);
	}

}

