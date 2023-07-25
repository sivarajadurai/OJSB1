package abstraction;


// Class can implement more than one interface
// Interface support multiple inheritance
public class WriteProgram implements Arithmetic,ArrayProgram{
	
	void print() {
		//How to access the ambiguous variable
		System.out.println(Arithmetic.number);
		System.out.println(ArrayProgram.number);
		//value = 12;
	}

	public static void main(String[] args) {
		WriteProgram wp = new WriteProgram();
		wp.sumofDigit(123);
		wp.palindrome(5);
		int a []= {3,2,6,4,1};
		int m = wp.max(a);
		//System.out.println(m);
		int k[] = wp.ascending(a);
		wp.print();
	}

	@Override
	public int sumofDigit(int num) {
		
		return 0;
	}

	@Override
	public void palindrome(int num) {
	
	}

	@Override
	public int max(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] ascending(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

}
