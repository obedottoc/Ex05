/*
 * This program is to caluclate the area
 * Developed by
 * N.pavithra.
 * Saveetha Engineering College
 * npavithra1405@gmail.com
 * 
 */
package areacaluclator;

public class Triangle extends Shape{
	public Triangle(int b,int h) {
		super.a1=b;
		super.a2=h;
	}

	@Override
	public void printarea() {
		// TODO Auto-generated method stub
		double area;
		
		area=(double) (0.5*super.a1*super.a2);
		System.out.printf("area of Triangle is %f",area);
	}

}