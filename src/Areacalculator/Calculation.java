/**
 * To create Areacalculator
 * 
 */
package Areacalculator;
import java.util.Scanner;
public class Calculation {
	public static void main(String[]args) {
		int options;
		Scanner sc=new Scanner(System.in);
		Circle C ;
		C=new Circle();
		Rectangle r;
     r=new Rectangle();
     Triangle t;
     t=new Triangle();
     while(true) {
     
    	 System.out.println("1.To find the area of circle:");
    	 System.out.println("2.To find the area of rectangle:");
    	 System.out.println("3.To find the area of the Triangle");
    	 System.out.println("4.Exit");
    	 System.out.println("Enter your options!!");
    	 options=sc.nextInt();
    	 switch(options)
    	 {
    	 case 1:
    		 C.printarea();
    		 System.out.println("-----------------");
    		 break;
    	 case 2:
    		 r.printarea();
    		 System.out.println("-------------");
    		 break;
    	 case 3:
    		 t.printarea();
    		 System.out.println("---------------");
    		 break;
    	 case 4:
    		 System.out.println("Thankyou for using area calculator");
    		 System.out.println("----------------");
    		 break;
    		 default:
    			 System.out.println("please enter a valid number:");
    			 System.out.println("-------------");
    			 break;
    			 
    		 
   	 }
    	 
   	}

  }
}


