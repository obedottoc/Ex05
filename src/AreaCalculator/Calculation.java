
/*
 * Java program to calculate the area of various shapes
 * using abstract class.
 *
 * author@bhaskar karthik
 *
 * karthikbhaskar2000@gmail.com
 */
package AreaCalculator;

import java.util.Scanner;

public class Calculation {


public static void main(String[] args) {
// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
int option=0;
int value1,value2;

while(true) {
System.out.println("1.To find area of Rectangle:");
System.out.println("2.To find the area of Triangle:");
System.out.println("3.To find the area of Circle:");
System.out.println("4.Exit");
System.out.println("Enter your choice:");
option=sc.nextInt();
switch(option)
{
case 1:
System.out.println("Enter the length of Rectangle:");
value1=sc.nextInt();
System.out.println("Enter the breadth of Rectangle:");
value2=sc.nextInt();
           Rectangle r=new Rectangle();
            r.printdata(value1,value2);
            int rect=r.printdata(value1,value2);
            System.out.println("The area of rectangle is:"+rect);
         
       break;
case 2:
System.out.println("Enter the base of Triangle:");
value1=sc.nextInt();
System.out.println("Enter the height of Triangle:");
value2=sc.nextInt();
           Triangle t=new Triangle();
           int printdata = t.printdata(value1, value2);
int tri=t.printdata(value1, value2);
System.out.println("the area of triangle is"+tri);
           
       break;
  case 3:
  System.out.println("Enter the radii of Circle:");
  value1=sc.nextInt();
            Circle c=new Circle();
            c.printdata(value1,value1);
int cir=c.printdata(value1,value1);
System.out.println("The area of circle is:"+cir);
       break;
  case 4:
  System.out.println("Thankyou for using the AREA CALCULATOR");
  break;
       default:
      System.out.println("Enter a valid number");
}
if(option==5)
{
break;
}

}
}
}
