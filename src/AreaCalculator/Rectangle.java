/****
 *Developed By Avinash Raja
 *Reg n0:212217105009
 *exp n0:1
 *EEE-A
 */
package AreaCalculator;
import java.util.Scanner;

public class Rectangle extends Shape{
    Double Rarea;
    Scanner sc =new Scanner(System.in);
    void printarea() {
        System.out.println("Enter the height and breadth of Rectangle: ");
        a=sc.nextInt();
        b=sc.nextInt();
        Rarea=(double) (a*b);               
        System.out.println("The area of Reactangle is: "+Rarea);
    }
           
}