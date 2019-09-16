/*
* This program is to calculate the area
* Developed by monica
* Saveetha Engineering College
* monicarajavel26@gmail.com
*
*/package areacalculator;

public class Triangle extends Shape{
public Triangle(int b,int h) {
super.a1=b;
super.a2=h;
}

@Override
public void printarea() {
// TODO Auto-generated method stub
double area;

area=(double) (0.5*super.a1*super.a2);
System.out.printf("area of Triangle is %f",area);
}

}