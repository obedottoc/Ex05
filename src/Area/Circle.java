/*developed by: kaushik kumar
* kaushikkaran08@gmail.com
*/
package Area;
import java.util.Scanner;
public class Circle extends Shape{
	double circlearea;
	public void printArea() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of the circle: \n");
		a=sc.nextInt();
		circlearea=(3.14)*a*a;
		System.out.printf("The radius of the circle is "+a+" and its area is "+circlearea);
	}
}