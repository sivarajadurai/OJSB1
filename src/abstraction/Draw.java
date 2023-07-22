package abstraction;

public class Draw extends Shape{
	
	Draw(){
		System.out.println("Draw");
	}

	public static void main(String[] args) {
		//Shape s = new Shape();
		Draw d = new Draw();
		float a = d.areaOfCircle(2);
		System.out.println(a);
		int b = d.areaOfSquare(2);
		System.out.println(b);
		d.area();
	}

	@Override
   float areaOfCircle(int radius) {
		float area = pi * radius *radius;
		return area;
	}

	@Override
	int areaOfSquare(int side) {
		int area = side *side;
		return area;
	}

}
