package threadprogram;

public class Example extends Thread {

	
	@Override
	public void run() {
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		//System.out.println("starting the program");
		Example e = new Example();
		e.start();
	
		System.out.println("End of the program");
	}

}
