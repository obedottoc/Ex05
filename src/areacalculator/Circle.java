package areacalculator;

public class Circle extends shape {

	public Circle(int r)
	{
	    
		super.a1=r;
	}

	@Override
	public void printArea() {
		double area;
		
		area=3.14*super.a1*super.a1;
		System.out.printf("Area of the circle is %f",area);
	}	

}	