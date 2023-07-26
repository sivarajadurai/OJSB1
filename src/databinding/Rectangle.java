package databinding;

public class Rectangle implements Shape{

	@Override
	public void area() {
		int length =34, breadth =25;
		System.out.println(length * breadth);
	}

}
