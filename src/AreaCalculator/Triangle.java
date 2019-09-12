package AreaCalculator;

import java.awt.geom.Arc2D.Double;
import java.util.Scanner;

public class Triangle extends Shape{
    double Tarea;
    Scanner sc= new Scanner(System.in);
    void printarea() {
        System.out.println("Enter the base and height of the triangle: ");
        a=sc.nextInt();
        b=sc.nextInt();
        Tarea=(0.5*a*b);
        System.out.println("The area of triangle is:"+Tarea);
       
    }

}