package shapearea;

public class Circle extends shape {
	
	public Circle(int l)
	{
		super.a=l;
	}
public void printarea() {
	
	double area;
	area=3.14*super.a*super.a;
	System.out.println("the area of the circle is:"+area);
}
}


