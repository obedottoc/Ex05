package areacalculator;

public class Triangle extends shape {

	public Triangle(int b,int h)
	{
		super.a1=b;
		super.a2=h;
	}

	@Override
	public void printArea() {
		int area;
		
		area= (int) (0.5*super.a1*super.a2);
		System.out.printf("Area of the triangle is %d",area);
	}	

}	
