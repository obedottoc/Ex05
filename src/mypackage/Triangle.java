package mypackage;



public class Triangle extends Shape{
	public Triangle(int b,int h) {
		super.a=b;
		super.b=h;
	}
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		double area;
		
		area = (0.5*super.a*super.b);
		System.out.println("Area of triangle is "+area);
	}

	
	

	
}
