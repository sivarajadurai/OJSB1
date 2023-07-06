package arrayprogram;

public class CopyArray {

	public static void main(String[] args) {
		int a[] = {2,5,7,3};
//		int b[] =a;//it is not copy, set new reference to array
//		b[0]=34;
//		for(int i=0;i<b.length;i++) {
//			System.out.println(a[i]);
//		}
		
		//copy the array
		int c[] = new int[a.length];
		for(int i=0;i<c.length;i++) {
			c[i]=a[i];
		}
		c[0]=32;
		for(int i=0;i<c.length;i++) {
			System.out.println(a[i]);
		}

	}

}
