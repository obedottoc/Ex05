package shapearea;
import java.util.Scanner;

public class rectangle extends shape{

public rectangle(int l, int h)
{
super.a=l;
super.b=h;
}
public void printarea() {
double area;
area=super.a*super.b;
System.out.println("The area of the rectangle is :"+area);
}
}