package Exceptionhandling;

public class StringException {

	public static void main(String[] args) {
		String name = "siva";
		int index = 1;
		
		try {
		System.out.println(name.charAt(index));
		}catch(NullPointerException e) {
			System.out.println("Invalid name : "+e);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Unable to find the index : "+e);
		}finally {
			System.out.println("finally ");
		}
		
		System.out.println("End of program");

	}

}
