package databinding;

public class Circle implements Shape{

	@Override
	public void area() {
		int radius = 3;
		System.out.println(3.14 * radius * radius);
	}

}
