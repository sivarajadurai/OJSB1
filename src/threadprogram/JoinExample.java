package threadprogram;

public class JoinExample extends Thread{

	
	@Override
	public void run() { //RUNNING
		
		for(int i =0;i<5;i++) {
			try {
				Thread.sleep(2000);//WAITING
			} catch (InterruptedException e) {
				System.out.println("Thread interupted");
			}
			System.out.println("Thread "+i);
		}
	}
	//TERMINATED

	public static void main(String[] args) {
		
		JoinExample t  = new JoinExample();//NEW
		t.start();//RUNNUABLE
		
		try {
			 
			t.join();// I will join with you after complete my task
			t.interrupt();
		} catch (InterruptedException e) {
			System.out.println("Join interupted");
		}
		for(int i =0;i<5;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("main interupted");
			}
			System.out.println("main "+i);
		}
	}

}
