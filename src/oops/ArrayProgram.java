package oops;

public class ArrayProgram {
	
	void print(int a[]) {
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	void maximum(int a[]) {
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max =a[i];
			}
		}
		System.out.println("The maximum element in given array is "+max);
	}
	
	void min() {
		int temp, size;
	      int array[] = {10, 20, 25, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Smallest element of the array is: "+array[0]);
	}

	public static void main(String[] args) {
		int arr[] = {3,2,-5,7,1};
		ArrayProgram ap = new ArrayProgram();
		ap.print(arr);
		ap.maximum(arr);
		ap.min();
		
		int arr2[] = {30,-12,15,-70,11};
		ap.print(arr2);
		ap.maximum(arr2);
		ap.number(arr2);
	}
	
void number(int vi[]){
		
		for(int i=0;i<vi.length;i++)
			System.out.println(vi[i]);
	}

}
