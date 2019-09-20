package AreaCalculator;

public class Triangle extends Shape{
	
	public Triangle(int b,int h)
	{
		super.a1=b;
		super.a2=h;
	}
    public void printArea() {
    	double area;
    	
    	area=(0.5*a1*a2);
    	System.out.println("The area of the triangle:"+area);
    }
}