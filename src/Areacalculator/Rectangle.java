	package Areacalculator;
	
	public class Rectangle extends Shape {
		    protected double height;
		    protected double width;
	
		    public Rectangle setHeight(double height) {
		        this.height = height;
		        onAreaChange();
		        return this;
		    }
	
		    public Rectangle setWidth(double width) {
		        this.width = width;
		        onAreaChange();
		        return this;
		    }
	
		   
		    public void onAreaChange() {
		        this.area = this.height * this.width;
	    }
	}
	
