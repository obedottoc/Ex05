/**
 * To calculate area of traingle 
 */
package Areacalculator;

import java.awt.geom.Arc2D.Double;
import java.util.Scanner;

public class Triangle extends Shape
{
  double Tarea;
  Scanner sc=new Scanner(System.in);
  
  
 public void printarea()
 {
	 System.out.println("Enter the base and height of the triangle:");
	 a=sc.nextInt();
	 b=sc.nextInt();
       Tarea=(int) (0.5*a*b);
 
  System.out.println("The area of triangle is:"+Tarea);
 }


@Override
public void print_area() {
	// TODO Auto-generated method stub
	
}

	
}
