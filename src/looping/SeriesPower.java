package looping;

public class SeriesPower {

	public static void main(String[] args) {
		// 1 4 27 256

		for (int i = 1; i <= 5; i++) {
			int res = 1;
			for (int j = 1; j <= i; j++) {
				res *= i;// 3
			}
			System.out.println(res);
		}

	}

}
