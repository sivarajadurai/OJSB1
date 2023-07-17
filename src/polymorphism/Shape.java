package polymorphism;

public class Shape {
	float pi = 3.14f;
	//Polymorphism - one in many form
	//Method overloading
	void area(int side) {
		System.out.println("Area of Square is "+side*side);
	}
	
	void area(int length,int breadth) {
		System.out.println("Area of Rectangle is "+length*breadth);
	}

	public static void main(String[] args) {
		
		Shape s1;
		//s1.area(3);
		Shape s = new Shape();
		s.area(3,7);
		s.area(4);
		System.out.println(s.pi);
		
		//instant
		System.out.println(new Shape().pi);
		new Shape().area(4);
		
		//unreachable object 
		
		
	}

}
