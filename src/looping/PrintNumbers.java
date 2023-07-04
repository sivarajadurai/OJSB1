package looping;

public class PrintNumbers {

	public static void main(String[] args) {
		int a=1;
		while(a<=10)
		{
			System.out.println(a);
			a++;//unsafe
		}
		
		int b=11;
		do {
			System.out.println(b);
			b++;
		}while(b<=10);

	}

}
