package oops;

public class Circle {
	//instance(object) variable
	double radius;
	final double pi = 3.14;
	//method
	void calculateArea() {
		//local variable
		double area;
		area = pi * radius * radius;
		System.out.println(area);
	}
	
	void circumstance() {
		double circum = 2 * pi*radius;
		System.out.println(circum);
	}
	public static void main(String args[]) {	
		Circle c = new Circle();//1. Creating an object and 
		//2. stores in variable
		//3. Constructor calling(execute)
		c.radius =5;
		c.calculateArea();	
		c.circumstance();
		
		Circle c2 = new Circle();
		c2.radius = 10;
		c2.calculateArea();
		c2.circumstance();
		c.calculateArea();
		
		for(int i=0;i<5;i++) {//scope
			System.out.println(i);
		}
		//System.out.println(i);
		
	}
}
