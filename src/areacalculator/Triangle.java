
/**
 * Application for area and length conversion
 * 
 * developed by
 * tamilfreakz002@gmail.com
 * saveetha engineering college 
 * tamilfreakz002@gmail.com
 * 
 */

package areacalculator;

public class Triangle extends Shape {
	public Triangle(int b, int h) {
		super.a1=b;
		super.a2=h;
		
	}
	
	public void printArea() {
		double area;
		
		area=0.5*super.a1*super.a2;
		System.out.println("The area of Triangle is "+area);

	}

}
