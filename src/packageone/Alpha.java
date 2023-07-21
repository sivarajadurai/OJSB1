package packageone;

public class Alpha {

	void m1() {
		System.out.println("Default method");
	}
	
	public void m2() {
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
