package looping;

public class BreakProgram {

	
	//Jumping or branching
	public static void main(String[] args) {
	
		int i=1;
		for(i=1;i<10;i++) {
			if(i%2==0) {
				return;//exit from current method
			}
			System.out.println(i);
		}
		System.out.println("End of program");
		
	}

}
