/*
 * developed by R.Nehareddy
 * EEE-B
 * 212217105049
 * 
 * 
 */

package areacalculator;

public class Rectangle extends shape {
	public Rectangle(int l,int b)
	{
		super.a1=l;
		super.a2=b;
	}

	@Override
	public void printarea() {
		int area;
		
		area=super.a1*super.a2;
		System.out.printf("area of Rectangle is %d",area);
	}
				
	}

	