/*****
 * Developed by
 * D. Sarathi Raj
 * 212217105054
 * sarathiraj852000@gmail.com
 */
package areacalculator;


public class Circle extends Shape{
	
	
	public Circle(int r) {
		super.a1=r;

	}
	public void printArea() {
		double area;
		area =3.14*super.a1*super.a1;
		System.out.println("area of circle is "+area);
		
	}
}
