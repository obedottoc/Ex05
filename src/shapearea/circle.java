package shapearea;
import java.util.Scanner;

public class circle extends shape {
	
	public circle(int l)
	{
		super.a=l;
	}
public void printarea() {
	
		
     double area; 
	 area=3.14*super.a*super.a;
	 System.out.println("The area of the circle is :"+area);
 	}
	}