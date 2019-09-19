package areacalculator;
import java.util.Scanner;

public class Circle  extends Shape{
	Double Cirarea;
	Scanner sc=new Scanner(System.in);
	void printarea() {
		System.out.println("Enter the raidus of the circle:");
		a=sc.nextInt();
		Cirarea=(double)(3.14*a*a);
		System.out.println("The area of the circle is;"+Cirarea);
	}

}
