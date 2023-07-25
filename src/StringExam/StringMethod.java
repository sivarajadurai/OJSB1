package StringExam;

public class StringMethod {

	public static void main(String[] args) {
		String s = " Payilagam institue ";
		System.out.println(s);
		int length = s.length();
		System.out.println(length);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.contains("Payilagam"));
		String s1 ="software";
		System.out.println(s+s1);
		System.out.println(s.concat(s1));
		System.out.println(s.charAt(1));///a[0]
		System.out.println(s.indexOf("g"));
		String mobile ="9750281070";
		char c [] = mobile.toCharArray();
		System.out.println(c[2]);
	}

}
