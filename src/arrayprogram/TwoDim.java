package arrayprogram;

public class TwoDim {

	public static void main(String[] args) {

		int a[][] = new int[2][3];
//1st row
		a[0][0] = 10;
		a[0][1] = 2;
		a[0][2] = 5;

//2nd row
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 5;
		
		int len = a.length;
		System.out.println(len);

		for (int i = 0; i < len; i++) {
			int collen = a[i].length;
			System.out.println("column : "+collen);
			
			for(int j =0;j<collen;j++) {
			System.out.println(a[i][j]);
			}
		}

	}

}
