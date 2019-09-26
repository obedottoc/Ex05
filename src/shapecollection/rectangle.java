package shapecollection;
import java.util.Scanner;
public class rectangle extends shape{
	double rectarea;
	public void printArea() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length and breadth of the rectangle: \n");
		a=sc.nextInt();
		b=sc.nextInt();
		rectarea=a*b;
		System.out.printf("The length and the breadth of the rectangle are"+a+" and "+b+" and its area is "+rectarea);
	}
}