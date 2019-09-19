 package areacalculator;

import java.util.Scanner;

public class Calculation1 {
	public static void main(String[]args) {
		int option;
		Scanner sc=new Scanner(System.in);
		Circle c;
		c=new Circle();
		Rectangle r;
		r=new Rectangle();
		Triangle t;
		t=new Triangle();
		while(true) {
			System.out.println("1.To find the area of the Circle:");
			System.out.println("2.To find the area of the Rectangle:");
			System.out.println("3.To find the area of the Triangle:");
			System.out.println("4. To Exit!!!!");
			System.out.println("Enter your option!!!");
			option=sc.nextInt();
			switch(option) {
			case 1:
				c.printarea();
				System.out.println("---------------------------------");
				break;
			case 2:
				r.printarea();
				System.out.println("---------------------------------");
				break;
			case 3:
				t.printarea();
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("THANK YOU FOR USING AREA CALCULATOR!!!");
				System.out.println("---------------------------------");
				break;
			default:
				System.out.println("Please enter a valid number!!!");
				System.out.println("---------------------------------");
			}
			}		
	}

}
