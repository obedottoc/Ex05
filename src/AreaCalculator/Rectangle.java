/*
 * Program to represent Rectangle
 * By Faizul
 * faizulsmart10@gmail.com
*/

package AreaCalculator;

import java.util.Scanner;

public class Rectangle extends Shape {

	int a;
	int b;
    Double Rarea;
    Scanner sc =new Scanner(System.in);
    void printarea() {
        System.out.println("Enter the length and breadth of Rectangle: ");
        a=sc.nextInt();
        b=sc.nextInt();
        Rarea=(double) (a*b);                
        System.out.println("The area of Reactangle is"+Rarea);
    } 
    
}
            
