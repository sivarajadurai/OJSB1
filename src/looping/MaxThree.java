package looping;

public class MaxThree {

	public static void main(String[] args) {
		int a = 30, b = 6, c = 222;

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is max");
			} else {
				System.out.println(c + " is max");
			}
		} else if (b > c) {
			System.out.println(b + " is max");
		} else {
			System.out.println(c + " is max");
		} 
		
		
	}

}
