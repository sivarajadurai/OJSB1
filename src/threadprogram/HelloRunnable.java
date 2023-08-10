package threadprogram;

import CollectionFramework.Program10;

public class HelloRunnable extends Program10 implements Runnable {
	//If already this class has parent then you can implement runnable

	public static void main(String[] args) {
		HelloRunnable h = new HelloRunnable();
		Thread t = new Thread(h);//in order to call run method
		t.start();
		System.out.println("End of program");
	}

	@Override
	public void run() {
		System.out.println("hello world");
	}

}
