package arrayprogram;

public class LeftRotate {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int len = a.length;
		
		int lastvalue = a[len-1];
		
//		a[len -1]=a[len-2];//a[4]=a[3]
//		a[len -2]=a[len-3];//a[3]=a[2]
//		a[len -3]=a[len-4];//a[2]=a[1]
//		a[len -4]=a[len-5];//a[1]=a[0]
		
		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		
		a[len-5] = lastvalue;//a[0]=5
		
		for(int i=0;i<len;i++) {
			System.out.println(a[i]);
		}
		
	}

}
