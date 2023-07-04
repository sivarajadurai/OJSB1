package looping;

public class Fibonacci {

	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13
		
		int first = -1;
		int second = 1;
		int count = 1;
		do {
			int third = first +second;//0  1
			System.out.println(third);// 0 1 1 2 3 5
			first = second;//1 0
			second = third;//0 
			count++;
		}while(count<=8);
		
		
		

	}

}
