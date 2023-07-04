package looping;

public class NumberPower {
	public static void main(String agrs[]) {
		int n = 2;
		int pow = 3;
		int ans = 1;
		for (int i = 1; i <= pow; i++) {
			ans = ans * n;//1*2   2*2   4*2
		}
		System.out.println("ans is " + ans);
	}
}
