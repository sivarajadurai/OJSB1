package arrayprogram;

public class NumOfTimes {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,3,2,2};
		int k =2;
		int count =0 ;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==k) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
