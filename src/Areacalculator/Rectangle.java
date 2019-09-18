/**
 * To calculate area of Rectangle;
 */
package Areacalculator;
import java.util.Scanner;


 public class Rectangle extends Shape
{
    int a;
    int b;
    double Rarea;
    Scanner sc=new Scanner(System.in);
       
 public void printarea()
 {
	 System.out.println("Enter the height and breadth of Rectangle");
	 a=sc.nextInt();
	 b=sc.nextInt();
	 Rarea=(double)(a*b);
	 System.out.println("The area of Rectangle is:"+Rarea);
	 
	 }

@Override
public void print_area() {
	// TODO Auto-generated method stub
	
}


 }