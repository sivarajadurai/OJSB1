package looping;

public class DivisibleThree {

	public static void main(String[] args) {
		
		int num =13;
		int div = 3;
		int i =1;
		int a=0;
		boolean flag=false;
		do {
			 a = div *i;
			if(num == a) {
				flag = true;
			}
			i++;
			
		}while(a<=num);
		
		if(flag == true) {
			System.out.print("number is multiple of 3" );
		}else {
			System.out.println("not multiple");
		}
		
		
	}

}
