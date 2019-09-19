/****
 *Developed By Avinash Raja
 *Reg n0:212217105009
 *exp n0:5
 *EEE-A
 */
package AreaCalculator;
import java.util.Scanner;
public class Calculation {
   
    public static void main(String[]args) {
        int option;
        Scanner sc=new Scanner(System.in);
        Circle c;
        c=new Circle();
        Rectangle r;
        r=new Rectangle();
        Triangle t;
        t=new Triangle();
       
    while(true)
    {
        System.out.println("1.To find the area of Circle:");
        System.out.println("2.To find the area of Rectangle:");
        System.out.println("3.To find the area of Triangle:");
        System.out.println("4.Exit");
        System.out.println("ENTER YOUR OPTIONS!!!!!!!");
     option=sc.nextInt();
     switch(option)
     {
     case 1:
         c.printarea();
         break;
     case 2:
         r.printarea();
         break;
     case 3:
         t.printarea();
         break;
     case 4:
         System.out.println("Thank you for using area calculator");
         break;
    default:
        System.out.println("Please enter a valid number:");
        break;
     }
    }
    }
}