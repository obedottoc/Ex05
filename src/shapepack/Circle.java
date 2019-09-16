/***
* EXPERIMENT-05
*developed by Nithishkumar
*Saveetha Engineering College
*jpnithishkumar@gmail.com
*/
package shapepack;

public  class Circle extends Shapes {
	public Circle(int r)
	{
		super.a1=r;
		
	}

	
	public void printarea() {
		double area;
		
		area=3.14*super.a1*super.a1;
		System.out.println("Area of Circle is:"+area);

	}


}
