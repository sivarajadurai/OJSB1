package method;

public class ReturnMethod {

	//instance Method with no argument and return type
	int give() {
		int a = 5;
		return a;// return the value of a
	}
	
	int add(int a,int b) {
		int c = a+b;//c=2+5
		return c;//7
	}
	
	int sumOfDigit(int num) {
		int sum = 0;
		while(num > 0) {
			sum = sum + num%10;
			num = num/10;
		}
		return sum;
	}

	public static void main(String args[]) {
		ReturnMethod rm = new ReturnMethod();
		int k = rm.give();// 5
		System.out.println(k);
		int result = rm.add(2, 5);
		System.out.println(result);
		int sum = rm.add(20, 15);
		System.out.println(sum);
		
		int sod = rm.sumOfDigit(254);
		System.out.println(sod);
	}

}
