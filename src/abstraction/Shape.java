package abstraction;

public abstract class Shape {
	// 0 -100%
	//63% abstract class
	static final float pi = 3.14f;
	int a =5;
	Shape(){
		System.out.println("shape");
	}
	
	//concrete method
	void area() {
		System.out.println("Area of shape");
	}
	abstract float areaOfCircle(int radius);
	abstract int areaOfSquare(int side);

}
