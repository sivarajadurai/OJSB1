package databinding;

public class Student {
	void draw(Shape s) {
		s.area();// runtime polymorphism
	}
	void play(Cat c) {
		c.run();
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.play(new Cat());
		
		s1.draw(new Circle());
		s1.draw(new Rectangle());
	}
}
