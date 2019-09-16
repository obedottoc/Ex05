package mypackage;

public class Rectangle extends Shape {
	public Rectangle(int l,int b) {
		super.a=l;
		super.b=b;
	}
	@Override
	public void printArea() {
		int area;
		
		area =super.a*super.b;
		System.out.println("Area of rectangle is" +area);
	}

}
