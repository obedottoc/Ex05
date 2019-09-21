package shapes;

public class Circle extends Shape {
	public Circle(int l)
	{
		super.a=l;
	}
public void printArea() {
	
	double area;
	area=3.14*super.a*super.a;
	System.out.println("The area of the given Circle is:"+area);
}

}




