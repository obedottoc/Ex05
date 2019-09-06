/*******
 * created by Akhshy Ganesh
 * Gmail: akhshyganeshb@gmail.com
 * program to calculate area
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
         System.out.println("-----------------------------------");
         break;
     case 2:
         r.printarea();
         System.out.println("-----------------------------------");
         break;
     case 3:
         t.printarea();
         System.out.println("-----------------------------------");
         break;
     case 4:
         System.out.println("Thank you for using area calculator");
         System.out.println("-----------------------------------");
         break;
    default:
        System.out.println("Please enter a valid number:");
        System.out.println("-----------------------------------");
        break;
     }
    }
    }
}