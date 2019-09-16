/*****
 * To create a program for Shapes
 * created by Rositha V
 * rosithav1@gmail.com
 */
package shapeclass;

import java.util.Scanner;

public class Circle extends Shape {

public Circle(int r) {
super.a=r;

}
public void printArea() {
double Area;
Area=3.14*a*a;
System.out.println("The area of the given circle is"+Area);
}
}