package control2716;

public class Vowel {

	public static void main(String[] args) {

		char letter = 'a';// A E I O U
		String result;

		switch (letter) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			result = "Vowels";
			break;
		default:
			result = "Consontant";

		}
		System.out.println(result);

	}

}
