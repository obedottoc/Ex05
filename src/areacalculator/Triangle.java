/*****
 * Developed by
 * D. Sarathi Raj
 * 212217105054
 * sarathiraj852000@gmail.com
 */
package areacalculator;

public class Triangle extends Shape{
	
	
	public Triangle(int h,int b) {
		super.a1=h;
		super.a2=b;
	}
	public void printArea() {
		int area;
		area=(1/2)*super.a1*super.a2;
		System.out.println("area of triangle is"+area);
		
	}
}

