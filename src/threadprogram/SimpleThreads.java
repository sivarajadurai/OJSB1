package threadprogram;

public class SimpleThreads extends Thread {
	static void threadMessage(String message) {
        String threadName =
            Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                          threadName,
                          message);
    }
	
	public void run() {
		threadMessage("hello ");
	}
	
	public static void main(String args[]) {
		SimpleThreads s = new SimpleThreads();
		s.setName("siva");
		s.start();
		
		SimpleThreads s1 = new SimpleThreads();
		s1.setName("subash");
		s1.start();
	}
}
