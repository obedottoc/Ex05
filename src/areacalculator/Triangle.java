package areacalculator;
import java.util.Scanner;
public class Triangle extends Shape{
		double tri;
		public void printArea() {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the base and height : \n");
			a=sc.nextInt();
			b=sc.nextInt();
			tri=(0.5)*a*b;
			System.out.printf("The  area is "+tri);
		}
}		