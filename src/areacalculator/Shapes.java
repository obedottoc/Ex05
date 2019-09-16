package areacalculator;

import java.util.Scanner;
public abstract class Shapes {

	public static void main(String[] args) {
		/*****
		 * created by atchaya
		 * 
		 */
		int option;
		double b,l,r,h,area;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1. To find the area of the Rectangle ");
			System.out.println("2. To find the area of the Triangle");
			System.out.println("3. To find the area of the Circle");
			System.out.println("4. To Exit");
			System.out.println("Enter the option");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Enter the Breath");
				b=sc.nextDouble();
				System.out.println("Enter the Length");
				l=sc.nextDouble();
				area=Rectangle.rectangle(b,l);
				break;
			case 2:
				System.out.println("Enter the Breath");
				b=sc.nextDouble();
				System.out.println("Enter the Height");
				h=sc.nextDouble();
				area=Triangle.triangle(b, h);
				break;
			case 3:
				System.out.println("Enter the Radius");
				r=sc.nextInt();
				area=Circle.circle(r);
			case 4:
				System.out.println("Thankyou for using area calculator applicaton:");
				break;
			default:
				System.out.println("Please enter the valid option:");			
			}
		}
	}

}
