package shapeclass;

import java.util.Scanner;


public class Rectangle extends Shape{
	public Rectangle(int l,int b) {
		
	
	    super.a=l;
		super.b=b;
	}
	
public void printArea() {
	
	 double Area;
	 Area=a*b;
	 System.out.println("The area of the given Rectangle is"+Area);
}

}