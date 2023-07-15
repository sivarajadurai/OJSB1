package method;

public class ArrayReturn {
	
	int[] giveArray() {
		int a[] = {3,5,1,2};
		return a;
	}
	
	int[] sortArray(int a[]) {//2,4,6,1
		for(int i =0;i<a.length-1;i++) {
			for(int j =i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		ArrayReturn ar = new ArrayReturn();
		int k[] = ar.giveArray();
		for(int i =0; i<k.length;i++) {
			System.out.println(k[i]);
		}
		System.out.println("after sorting:");
		int l[] = ar.sortArray(k);
		for(int i =0; i<k.length;i++) {
			System.out.println(l[i]);
		}
		
	}

}
