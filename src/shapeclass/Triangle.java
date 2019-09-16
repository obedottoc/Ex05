/****
 * Program for shape


 * @author RAJAMANICKAM A
 *  rajapandidevi1997@gmail.com
 */
package shapeclass;

import java.util.Scanner;

public class Triangle extends Shape {
public Triangle(int h,int b) {
	super.a=h;
		super.b=b;

}

public void  getinput() {
     Scanner sc=new Scanner(System.in);
     System.out.println("For the Area of Triangle Enter the height and base");
     a=sc.nextInt();
     b=sc.nextInt();
}
    public void printArea() {
    	double Areaoftriangle;
     Areaoftriangle=0.5*a*b;
     System.out.println("The area of Triangle is"+Areaoftriangle);
}
}

