package inheritance;

public class ArrayProgram extends Loop {
	
	int max (int[] a) {
		int max= a[0];
		for(int i =0; i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		ArrayProgram ap = new ArrayProgram();
		ap.add(1, 2);
		ap.sumOfDigit(123);
		ap.reverse(232);
		ap.fibonaci(4);
	//	ap.palindrome();
		int a[] = {};
		ap.max(a);
	}

}
