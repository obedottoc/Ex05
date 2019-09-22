/*
 * triangle class that abstracts the shape class.
 * author@bhaskar karthik
 */
package areacalculator;

public class Triangle extends Shape {

	@Override
	public int printdata(int a, int b) {
		// TODO Auto-generated method stub
		int tri=(int) (0.5*a*b);
		return tri;
	}
}