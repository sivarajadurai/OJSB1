package Exceptionhandling;

public class Arithmetic {

	public static void main(String[] args) {
		
		int a =4,b=0;
		int c = 0;
		try {
		c=a/b;//Exception occurs - Runtime exception
		}catch(Exception e) {
			//System.out.println("exception occurs"+e);
		}
		System.out.println(c);
		
		
	}

}
