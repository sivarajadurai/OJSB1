package threadprogram;

public class SleepMessages {

	public static void main(String[] args) {
		
		

		String name[] = { "Venkatesh", "Subash", "Srini", "Bala", "Vijay", "Mathesh" };
		for (int i = 0; i < name.length; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupt");
			}//5 sec
			System.out.println(name[i]);
			
		}

	}

}
