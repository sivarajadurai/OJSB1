package arrayprogram;

public class ArrayFirst {

	public static void main(String[] args) {
		int a0 =3;
		int a1 =20;
		int a2=10;
		int a3=2;
		
		int a[] = new int[100];
		float b[] = new float[5];
		
		int c[] = {2,5,12,20,5};
//		System.out.println(c[0]);
//		System.out.println(c[1]);
//		System.out.println(c[2]);
//		System.out.println(c[3]);
		
		
		int count = c.length;
		System.out.println("count : "+count);
		for(int i =0;i<count;i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("Reverse order");

		for(int i =count-1;i>=0;i--) {
			System.out.println(c[i]);
		}
	}

}
