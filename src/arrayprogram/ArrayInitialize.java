package arrayprogram;

public class ArrayInitialize {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6}};
		
		int len = a.length;
		for (int i = 0; i < len; i++) {
			int collen = a[i].length;
			for(int j =0;j<collen;j++) {
				if(a[i][j]%2==0)
				{
					System.out.print(a[i][j]+" ");
				}
			}
		}
		
	}

}
