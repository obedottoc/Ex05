package shapes;

public class Triangle extends Shape {
	public Triangle(int l, int h)
	{
		super.a=l;
		super.b=h;
	}
	public void printArea() {
		double area;
		area=0.5*super.a*super.b;
		System.out.println("the area of the triangle is:"+area);
	}

	}




