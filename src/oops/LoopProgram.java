package oops;
public class LoopProgram {
	int num;
	
	//non-parameter method or no argument method
	void fact() {
		int fact =1;
		for(int i=1;i<=num;i++) {
			fact *=i;
		}
		System.out.println(fact);
	}
	
	void fib() {
		int first =-1,second =1;
		for(int i =0;i<num;i++) {
			int third = first +second;
			System.out.println(third);
			first = second;
			second =third;
		}
	}

	public static void main(String[] args) {
		LoopProgram lp1 = new LoopProgram();
		lp1.num = 5;
		lp1.fact();
		lp1.fib();
		
		LoopProgram lp2 = new LoopProgram();
		lp2.num =10;
		lp2.fact();
		lp2.fib();
		
	}

}
