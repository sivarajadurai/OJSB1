package arrayprogram;

public class RightRotate {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int len = a.length;
		//first right rotate
		int first = a[0];
		for(int i =0;i<len-1;i++) {
			a[i]=a[i+1];
		}
		a[len -1]=first;
		
		//second right rotate
		first = a[0];
		for(int i =0;i<len-1;i++) {
			a[i]=a[i+1];
		}
		a[len -1]=first;
		
		
		for(int i=0;i<len;i++) {
			System.out.println(a[i]);
		}
		

	}

}
