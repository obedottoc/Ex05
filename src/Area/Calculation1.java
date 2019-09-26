/*developed by: Kaushik Kumar
* kaushikkaran08@gmail.com
*/
package Area;
import java.util.Scanner;
public class Calculation1 {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		int option;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\n Enter the shape of area you want to calculate: ");
			System.out.println("1.Rectangle");
			System.out.println("2.Triangle");
			System.out.println("3.Circle");
			System.out.println("4.Exit");
			option=sc.nextInt();
			switch(option)
			{	
			case 1:
				r.printArea();
				break;
			case 2:
				t.printArea();
				break;
			case 3:
				c.printArea();
				break;
			case 4:
				System.out.println("Thanks for using the application!");
				break;
			default:
				System.out.println("Enter a valid option!!");
			}
			if(option==4)
				break;			
		}
	}
}
