/*
 * This program is to caluclate the area
 * Developed by
 * N.pavithra.
 * Saveetha Engineering College
 * npavithra1405@gmail.com
 * 
 */
package areacaluclator;

public class Circle extends Shape{
	public Circle(int r) {
		super.a1=r;
	
	}

	@Override
	public void printarea() {
		// TODO Auto-generated method stub
		double area;
		
		area= (double) (3.14*super.a1*super.a1);
		System.out.printf("area of circle is %f",area);
	}

}
