package areacalculator;

public class Rectangle extends Shape{
	
	
	public Rectangle(int l,int b){
	  super.a1=l;
	  super.a2=b;
	  

}
   public void printArea() {
	   int area;
	   area =super.a1*super.a2;
	   System.out.println("area of rectangle is "+area);
	  
   }
   
}
