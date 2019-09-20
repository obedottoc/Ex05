package shapes;

public class Rectangle extends shape {

	public Rectangle(int l, int h)
	{
		super.a=l;
		super.b=h;
	}
public void printarea() {
	double area;
	area=super.a*super.b;
	System.out.println("the area of the rectange is:"+area);
 }
	}

  