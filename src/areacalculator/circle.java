/*
 * developed by R.Nehareddy
 * EEE-B
 * 212217105049
 * 
 * 
 */

package areacalculator;

public class circle extends shape {
	public circle(int r)
	{
		super.a1=r;
	}

	@Override
	public void printarea() {
		int area;
		
		area=(int) (3.14*super.a1*super.a1);
		System.out.printf("area of circle is%d", area);

	}

}
