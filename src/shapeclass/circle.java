
package shapeclass;

import java.util.Scanner;

public class circle extends Shape {
    
	public circle(int r) {
		super.a=r;
		
	}
	public void printArea() {
		double Area;
		Area=3.14*a*a;
		System.out.println("The area of the given circle is"+Area);
	}
}