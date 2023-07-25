package StringExam;

public class StringExpl {
	
	
	int countWord(String s) {
		String s1[] = s.split(" ");
//		for(int i=0;i<s1.length;i++) {
//			System.out.println(s1[i]);
//		}
		return s1.length;
	}

	public static void main(String[] args) {
		String s = "java";
		s = "python";//Create new object 'python' in scp and refers the s
		// "java" object will be disconnect the refers s
		// Java String is immutable(not changable)
		int a=3;
		a=5;
		System.out.println(s);
		StringExpl se = new StringExpl();
		int countWord = se.countWord("This is first program");
		System.out.println(countWord);
	}

}
