package arrayprogram;

public class AddMatrix {

	public static void main(String[] args) {
		
		int a[][]= {{2,5,3},{5,7,4}};
		int b[][]= {{1,4,2},{6,3,2}};
		int c[][] = new int[2][3];
		int len = c.length;
		for (int i = 0; i < len; i++) {
			int collen = c[i].length;
			for(int j =0;j<collen;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		/*3 9 5
		 * 11 10 6
		 */
		for (int i = 0; i < len; i++) {
			int collen = c[i].length;
			for(int j =0;j<collen;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
