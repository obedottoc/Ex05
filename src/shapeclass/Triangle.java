/****
 * N.Gurusaibabu
 * EEE B
 */

package shapeclass;

import java.util.Scanner;

public class Triangle extends Shape {
public Triangle(int h,int b) {
	super.a=h;
	super.b=b;
}

public void  printArea() {
	 double Areaoftriangle;
	 Areaoftriangle=0.5*a*b;
	 System.out.println("The area of Triangle is"+Areaoftriangle);
}
}
