package StringExam;
//Count of each character in a given String
public class CountChar {
	
	void count(String s) {
		int j=0, a=0, v=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='j') {
				j++;
			}
			if(s.charAt(i)=='v') {
				v++;
			}
			if(s.charAt(i)=='a') {
				a++;
			}
		}
		System.out.println("j -->"+j);
		System.out.println("a -->"+a);
		System.out.println("v -->"+v);
	}
	
	void count2(String s) {
		int a[] = new int[256];
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			a[c]++;//a[106]++;   a[97]++; //a[118]++
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i] >0) {
				char c = (char)i;
				System.out.println(c +"-->"+a[i]+"-->"+i);
			}
		}
	}
	
	
	
	
	
	public static void main(String agrs[]) {
		
		CountChar cc = new CountChar();
		cc.count2("java");
		
		
		//No literal
		StringBuffer sb = new StringBuffer("java");
		sb.length();
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder s = new StringBuilder("java");
		s.length();		
		StringBuilder s1 = new StringBuilder("java");
		s1.reverse();
		System.out.println(s1);
		
		
		
		
	//	Stringbuffer ss = "java";
	}

}
/* j->1
 * a-> 2
 * v ->1
 */