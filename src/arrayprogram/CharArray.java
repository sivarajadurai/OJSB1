package arrayprogram;

public class CharArray {

	public static void main(String[] args) {
		char c[] = { 's', 'i', 'v', 'a' };// Array of character

		int len = c.length;
		int i = 0;
		while (i < len) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				System.out.println(c[i]);
			}
			i++;
		}

	}

}
