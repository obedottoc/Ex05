package AreaCalculator;

public class Circle extends Shape{
	
	public Circle(int r)
	{
		super.a1=r;
	}
    public void printArea() {
    	double area;
    	
    	area=3.14*a1*a1;
    	System.out.println("The area of the circle:"+area);
    }
}    