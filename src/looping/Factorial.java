package looping;

public class Factorial {
	
	public static void main(String arg[]) {
		// 5! = 5*4*3*2*1 =120
		
		int i =5;
		int fact =1;
		while(i>=1) {
			fact = fact *i;
			i--;
		}
		System.out.println(fact);
	}

}
/*
i=5
fact =1
5>=1 true
fact = 1 *5 =5

i=4
4>=1 true
fact = 5 * 4 = 20

i=3
3>=1 true
fact = 20 *3 = 60

i=2
2>=1 true
fact = 60 * 2 =120

i=1
1>=1 true
fact = 120 *1 = 120





















*/