/**created by M.uday kanth
 * eee-b, 212217105037
 * 
 */
package shapearea;

public class triangle extends shape {

	public triangle(int l, int h)
{
	super.a=l;
	super.b=h;
}
public void printarea() {
	double tri;
	tri=0.5*super.a*super.b;
	System.out.println("the area of the triangle is:"+tri);
}


}
