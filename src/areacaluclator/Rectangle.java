package areacaluclator;

public class Rectangle extends Shape{

	public Rectangle(int l,int b) {
		super.a1=l;
		super.a2=b;
	}

	@Override
	public void printarea() {
		// TODO Auto-generated method stub
		int area;
		
		area= super.a1*super.a2;
		System.out.printf("area of Rectangle is %d",area);
	}


}
