package areacalculator;

public class Calculation {

	public static void main(String []args) {
		
		
		Rectangle r = new Rectangle(20,40);
		r.printArea();
		
	
		Triangle t = new Triangle(20,40);
		t.printArea();
		
		
		Circle c = new Circle(20);
		c.printArea();
	}
}
