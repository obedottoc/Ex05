package areacalculator;
import java.util.Scanner;


public class Triangle extends Shape {
	Double triarea;
	Scanner sc=new Scanner (System.in);
	void printarea() {
		System.out.println("Enter the base and height:");
		a=sc.nextInt();
		b=sc.nextInt();
		triarea=(double)((0.5)*a*b);
		System.out.println("The area of Rectangle is:"+triarea);
}
}
