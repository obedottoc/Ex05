/***
* EXPERIMENT-05
*developed by Nithishkumar
*Saveetha Engineering College
*jpnithishkumar@gmail.com
*/
package shapepack;

public  class Rectangle extends Shapes {
	public Rectangle(int l,int b)
	{
		super.a1=l;
		super.a1=b;
		
	}

	
	public void printarea() {
		double area;
		
		area=0.5*super.a1*super.a1;
		System.out.println("Area of Circle is:"+area);

	}


}
