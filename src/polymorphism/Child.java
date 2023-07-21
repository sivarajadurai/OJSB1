package polymorphism;

public class Child extends Parent {
	

	@Override
	void sub() {
		System.out.println("child sub");
		super.sub();
		mul();
	}

	@Override
	int add(int a, int b) {
		short k = 9;
		return k;
	}

	static void swap() {
		System.out.println("Child program");
		int a = 3, b = 9;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args) {
		Child c = new Child();
		c.swap();
		c.sub();

		Parent p = new Parent();
		p.swap();
	}

}
