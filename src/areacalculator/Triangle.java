package areacalculator;
import java.util.Scanner;

public class Triangle extends Shape {
	Double TRarea;
	Scanner sc=new Scanner(System.in);
	void printarea() {
		System.out.println("Enter the base and height of triangle");
		a=sc.nextInt();
		b=sc.nextInt();
		TRarea=(0.5*a*b);
		System.out.println("The area of triangle is:"+TRarea);
	


	}
}