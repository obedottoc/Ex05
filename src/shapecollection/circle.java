package shapecollection;
import java.util.Scanner;
public class circle extends shape{
	double circlearea;
	public void printArea() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of the circle: \n");
		a=sc.nextInt();
		circlearea=(3.14)*a*a;
		System.out.printf("The radius of the circle is "+a+" and its area is "+circlearea);
	}
}
