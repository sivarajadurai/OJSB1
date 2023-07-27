package Exceptionhandling;

public class ThrowExam {

	int divide(int a, int b) throws Exception {
		int c = -1;
		try {
			c = a / b;// Exception occurs - Runtime exception
		} catch (Exception e) {
			throw e;
		} finally {
			return c;
		}
	}

	public static void main(String[] args) {
		ThrowExam te = new ThrowExam();
		int c = 0;
		try {
			c = te.divide(20, 10);
		} catch (Exception e) {
			System.out.println("Exception handle in main method");
		}
		System.out.println(c);
	}

}
