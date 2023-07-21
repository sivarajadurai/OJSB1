package polymorphism;

public class SecondStd extends FirstStd {
	int c;
	public SecondStd(int a, int b,int c) {
		super(a, b);
		this.c =c;
	}
	int add() {
		return a+b+c;
	}
	public static void main(String[] args) {
		
		SecondStd ss = new SecondStd(1,4,2);
		int result = ss.add();
		System.out.println(result);
		
		FirstStd fs = new FirstStd(2,4);
		int sum = fs.add();
		System.out.println(sum);
		
	}

}
