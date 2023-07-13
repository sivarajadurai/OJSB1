package looping;

public class Sqrt {

	public static void main(String[] args) {
		int num = 12;
		double t;  
		double sqrtroot=num/2;  //6
		do   
		{  
		t=sqrtroot;  // 12 4 
		sqrtroot=(t+(num/t))/2;  //6+(12/6)/2=4  
		}   
		while((t-sqrtroot)!= 0);  
		System.out.println(sqrtroot);  
	}

}
