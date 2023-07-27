package Exceptionhandling;

public class ArrayException {
	
	public static void main(String ags[]) {
		int a[] = {2,3,4,1,5};
		int index= 10;
		
		try {
		System.out.println(a[index]);
		}catch(Exception e) {
			System.out.println("unable to find this index. Please find last index value");
			System.out.println(a[a.length -1]);
		}
	}

}
