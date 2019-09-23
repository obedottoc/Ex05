
 package areacalculator;

public class Circle extends Shape {
	public Circle(int c) {
		super.a1=c;
		
		
	}
	
	

	public void printArea() {
		double area;
		
		area=3.14*super.a1*super.a1;
		System.out.println("The area of Circle is "+area);

	}

}

