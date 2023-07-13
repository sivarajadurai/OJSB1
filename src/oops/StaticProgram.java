package oops;

public class StaticProgram {
	
	int x;
	static int y;//common variable for all object

	public static void main(String[] args) {
	
		StaticProgram sp = new StaticProgram();
		sp.x = 10;
		sp.y = 5;
		StaticProgram sp1 = new StaticProgram();
		sp1.x =20;
		sp1.y = 25;
	System.out.println("end");	
	}

}
