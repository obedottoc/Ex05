
package areacalculator;
import java.util.Scanner;
public class Circle extends Shape{
	double circ;
	public void printArea() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius: \n");
		a=sc.nextInt();
		circ=(3.14)*a*a;
		System.out.printf("The  area is "+circ);
	}
}
