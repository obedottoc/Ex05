package mypackage;



public class Circle extends Shape {

	public Circle(int l) {
		super.a=l;
		
	}
	@Override
	public void printArea() {
		int area;
		
		area =(int) (3.14*super.a*super.a);
		System.out.println("Area of circle is "+area);
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
