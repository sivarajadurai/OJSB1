package looping;

public class FactorialSeries {

	public static void main(String[] args) {

		int n = 1;
		while (n <= 4) {
			int fact = 1;
			int j = 1;
			while (j <= n) {
				fact *= j;
				j++;
			}
			System.out.println(fact);
			n++;
		}
	}

}
