package areacalculator;

public class Rectangle extends shape {
	
	public Rectangle(int l,int b)
	{
		super.a1=l;
		super.a2=b;
	}

	@Override
	public void printArea() {
		int area;
		
		area=super.a1*super.a2;
		System.out.printf("Area of the rectangle is %d",area);
	}	

}	

	
