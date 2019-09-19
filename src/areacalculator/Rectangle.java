package areacalculator;
import java.util.Scanner;

public class Rectangle extends Shape{
	Double Recarea;
	Scanner sc=new Scanner (System.in);
	void printarea() {
		System.out.println("Enter the height and breadth of the Rectangle:");
		a=sc.nextInt();
		b=sc.nextInt();
		Recarea=(double)(a*b);
		System.out.println("The area of Rectangle is:"+Recarea);
	}

}
