package StringExam;

public class CountVowels {
	
	void Count(String s) {
		s = s.toLowerCase();//siva
		int count = 0;
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c =='i' || c== 'o' || c=='u')
			{
				count ++;
			}
		}
		System.out.println(count);
	}
	
	void printNum(String s) {
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c >= '0' && c<='9') //'1'>='0' 49>=48
			{
				System.out.println(c);
			}
		}
	}
	
	void printLetter(String s) {
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if((c >= 'a' && c<='z') || (c >= 'A' && c<='Z')  )
			{
				System.out.println(c);
			}
		}
	}

	public static void main(String[] args) {
		CountVowels cv = new CountVowels();
		cv.Count("sivA");
		cv.Count("Payilagam");	
		System.out.println("Count numbers");
		cv.printNum("456java123");
		System.out.println("Count Letters");
		cv.printLetter("456java123");
	}

}
