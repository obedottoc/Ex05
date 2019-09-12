package areacalculator;
import java.util.Scanner;
public class Rectangle extends Shape{
	double rec;
	public void printArea() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length and breadth : \n");
		a=sc.nextInt();
		b=sc.nextInt();
		rec=a*b;
		System.out.printf("The area is "+rec);
	}
}