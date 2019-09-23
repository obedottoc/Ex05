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
		super.a2=b;
		
	}

	
	public void printarea() {
		double area;
		
		area=super.a1+super.a2;
		System.out.println("Area of Rectangle is:"+area);

	}


}
