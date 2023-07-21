package inheritance;


//Multi level
public class IfProgram extends Loop {
	
	void palindrome(int n) {
		int rev = reverse(n);
		if(rev == n) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

	public static void main(String[] args) {
		IfProgram ip = new IfProgram();
		ip.palindrome(131);
		
	}

}
