package polymorphism;

public class Parent {
	
	void mul() {
		
	}
	void sub() {
		System.out.println("Parent sub");
	}
	
	int add(int a,int b) {
	return a+b;
	}
	
	static void swap() {
		System.out.println("Parent Program");
		int a=10,b=3;
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}

}
