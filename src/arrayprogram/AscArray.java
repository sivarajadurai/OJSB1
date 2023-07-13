package arrayprogram;
/* 2 3 6 4 1
 * 1 6 3 4 2
 * 1 3 6 4 2
 * 1 2 6 4 3
 * 1 2 4 6 3
 * 1 2 3 6 4
 * 1 2 3 4 6
 */

public class AscArray {
	public static void main(String[] args) {
		int a[]= {3,2,6,4,1};	
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				//System.out.print(a[i]+">"+a[j]+"-->");
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i] =a[j];
					a[j]= temp;
				}	
//				for(int k =0;k<a.length;k++) {
//					System.out.print(a[k]+" ");
//				}
//				System.out.println("");
			}
			//System.out.println("-------");
		}
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
