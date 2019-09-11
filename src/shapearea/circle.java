/**created by M.uday kanth
 * eee-b, 212217105037
 * 
 */

package shapearea;

public class circle extends shape {
	
	public circle(int l)
	{
		super.a=l;
	}
public void printarea() {
	
	double area;
	area=3.14*super.a*super.a;
	System.out.println("the area of the circle is:"+area);
}
	}
