package Area;

import java.util.Scanner;

public class Circle extends ShapeClass {
	
	
	
	public Circle(int r) {
		
		
	    super.a=r;
		
	}

	
public void printArea() {

	 double Area;
	 Area=3.14*a*a;
	 System.out.println("The Area of the given circle is"+Area);
}

}