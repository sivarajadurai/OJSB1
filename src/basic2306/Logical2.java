package basic2306;

public class Logical2 {

	public static void main(String args[]) {
		boolean val1 = true;
		boolean val2 = false;

		int a = 4, b = 7;
		boolean c = a > b;
		System.out.println(c);
		System.out.println(a<b && a>b);
		System.out.println(a>b && a==b);
		System.out.println(a>b && (a=a+1)>b);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Logical operation");
		
	}

}
