package AreaCalculator;

public class Rectangle extends Shape{
	
	public Rectangle(int l,int b)
	{
		super.a1=l;
		super.a2=b;
	}
    public void printArea() {
    	int area;
    	
    	area=a1*a2;
    	System.out.println("The area of the rectangle:"+area);
    }
}