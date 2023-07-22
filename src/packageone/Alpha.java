package packageone;

//final class cannot extend
public class Alpha {
	
	//inner class can be private or protected
	protected class Reaction{
		
	}
	
    //private constructor does not allow to create an object outside the class
	//public constructor can be access to all
	//Default constructor can be access within the package, whereas other package class does not access
	public Alpha(){
		System.out.println("Alpha");
	}

	void m1() {
		System.out.println("Default method");
	}
	
	//final method cannot be overridden
	public final void m2() {
		System.out.println("Public method");
	}
	
	protected void m3() {
		System.out.println("Protected method");
	}
	
	private void m4() {
		System.out.println("Default method");
	}
	
	public static void main(String args[]) {
		Alpha a = new Alpha();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}

}
