package areacalculator;
import java.util.Scanner;


public class Circle extends Shape {
	Double Ciarea;
	Scanner sc=new Scanner(System.in);
	void printarea() {
		System.out.println("Enter the radius of the circle:");
		a=sc.nextInt();
		Ciarea=(double)(3.14*a*a);
		System.out.println("The area of the circle is:"+Ciarea);
	}

}
