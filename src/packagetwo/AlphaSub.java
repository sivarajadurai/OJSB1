package packagetwo;

import packageone.Alpha;

public class AlphaSub extends Alpha{
	
	/*public void m2() {
		System.out.println("Child public method");
	}*/

	public static void main(String[] args) {
		AlphaSub a = new AlphaSub();
	//	a.m1();
		a.m2();
		a.m3();
	//	a.m4();
	}

}
