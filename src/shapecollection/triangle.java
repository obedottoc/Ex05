package shapecollection;
import java.util.Scanner;
public class triangle extends shape{
		double triarea;
		public void printArea() {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the base and height of the triangle: \n");
			a=sc.nextInt();
			b=sc.nextInt();
			triarea=(0.5)*a*b;
			System.out.printf("The height and the width of the triangle are"+a+" and "+b+" and its area is "+triarea);
		}
}		