/*
 * This program is to caluclate the area
 * Developed by
 * N.pavithra.
 * Saveetha Engineering College
 * npavithra1405@gmail.com
 * 
 */
package areacaluclator;

public class Caluclation {

	public static void main(String[] args) {
		Shape s1,s2,s3;
		s1=new Rectangle(3,4);
		s2=new Triangle(6,7);
		s3=new Circle(6);
		s1.printarea();
		s2.printarea();
		s3.printarea();

	}

}
