package oops;

public class Area {
	
	final double pi = 3.14;
	//Need to give side value as input
	//parameter method
	void square(int side) {	
		int areaOfSquare = side * side;
		System.out.println("Area of Square is "+areaOfSquare);
	}
	
	void rectangle(int length, int breadth) {
		int areaOfRectagle = length *breadth;
		System.out.println("Area of Rectangle is "+areaOfRectagle);
	}
	
	void circle(double radius) {
		double areaOfCircle = pi * radius * radius;
		System.out.println("Area of Circle is "+areaOfCircle);
	}

	void triangle(int base,double height) {
		double areaOfTriangle = height * base /2;
		System.out.println("Area of Triangle is "+areaOfTriangle);
	}
	public static void main(String[] args) {
		Area a = new Area();
		a.square(3);//input = 3
		a.square(4);//input = 4
		a.rectangle(3, 4);
		a.circle(5);
		a.triangle(12,3.4);
	}

}
