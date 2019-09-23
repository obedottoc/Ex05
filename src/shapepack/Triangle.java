/***
* EXPERIMENT-05
*developed by Nithishkumar
*Saveetha Engineering College
*jpnithishkumar@gmail.com
*/
package shapepack;

	public  class Triangle extends Shapes {
		public Triangle(int b,int h)
		{
			super.a1=b;
			super.a2=h;
			
		}

		
		public void printarea() {
			double area;
			
			area=0.5*super.a1*super.a2;
			System.out.println("Area of Triangle is:"+area);

		}


	}
