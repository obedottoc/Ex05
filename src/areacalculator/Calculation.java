
/**
 * Application for area and length conversion
 * 
 * developed by
 * tamilfreakz002@gmail.com
 * saveetha engineering college 
 * tamilfreakz002@gmail.com
 * 
 */
package areacalculator;

public class Calculation {
            
	public static void main(String []args) {
		
		Rectangle r=new Rectangle(20,40);
		r.printArea();
		

		Triangle t=new Triangle(20,40);
		t.printArea();
		

		Circle c=new Circle(20);
		c.printArea();
	}
}

