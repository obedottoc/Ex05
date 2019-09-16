/*
 * developed by R.Nehareddy
 * EEE-B
 * 212217105049
 * 
 * 
 */

package areacalculator;

public class Triangle extends shape {
	
	public Triangle(int b,int h)
	{
		super.a1=b;
		super.a2=h;
	}

	@Override
	public void printarea() {
		int area;
		
		area=(int) (0.5*super.a1*super.a2);
		System.out.printf("area of triangle is %d",area);

	}

}
