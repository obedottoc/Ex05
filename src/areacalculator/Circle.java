
/*
 * circle class that abstract the shape class
 * author@bhaskar karthik
 */
package areacalculator;

public class Circle extends Shape {

	@Override
	public int printdata(int a,int b) {
		// TODO Auto-generated method stub
		int cir=(int) (3.14*a*a);
		return cir;
	}

}
