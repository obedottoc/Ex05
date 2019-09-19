package areacalculator;
import java.util.Scanner;

public class Rectangle extends Shape {
	Double Rearea;
		Scanner sc=new Scanner(System.in);
		void printarea() {
			System.out.println("Enter the height and breadth of  rectangle");
			a=sc.nextInt();
			b=sc.nextInt();
			Rearea=(double)(a*b);
			System.out.println("The area of Rectangle is:"+Rearea);
		}
	}


