/***
 * 
 * To  calculate area of circle
 */
package Areacalculator;
import java.util.Scanner;

public class Circle extends Shape
{
 int a;
   double Carea;
   
   Scanner sc=new Scanner(System.in);
 public void printarea()
 {
	 System.out.println("Enter the Radius of the Circle:");
	 a=sc.nextInt();
	 Carea=(double)(3.14*a*a);
	 System.out.println("The area of circle is:"+Carea);
	 
 }
@Override
public void print_area() {
	// TODO Auto-generated method stub
	
}

	

}

