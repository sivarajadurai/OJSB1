package arrayprogram;

public class BiggestNumber {

	public static void main(String[] args) {

		int a[] = { 2, 5, 4, -7, 3, 4 };
		int max = a[0];// 2
		for (int i = 0; i < a.length; i++) {
			if (a[i] < max) {
				max = a[i];// 7
			}
		}
		System.out.println(max);

	}

}
