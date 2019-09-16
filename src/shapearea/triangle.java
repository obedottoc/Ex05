package shapearea;
import java.util.Scanner;

public class triangle extends shape{


public triangle(int l, int h)
{
super.a=l;
super.b=h;
}
public void printarea() {

double tri;

tri=0.5*super.a*super.b;
System.out.println("The area of the triangle is :"+tri);
}
}


