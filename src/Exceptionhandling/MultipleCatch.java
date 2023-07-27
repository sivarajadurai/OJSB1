package Exceptionhandling;

public class MultipleCatch {
	
	int a,b;
	MultipleCatch(int a, int b){
		this.a =a;
		this.b =b;
	}
	public static void main(String[] args) {
		int c = 0;
		MultipleCatch m=null;
		try {
		 c= m.a/m.b;//Either nullpointer or arithmetic
		}catch(ArithmeticException e) {
			c=1;
			System.out.println("invalid value ");
		}
		catch(NullPointerException e) {
			c=2;
			System.out.println("invalid object");
		}
		System.out.println(c);
	}

}
