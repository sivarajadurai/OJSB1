package abstraction;

//Class can extend only one class
public class Bank extends ATM{

	public static void main(String[] args) {
	
		Bank b = new Bank();
		b.getMessage();
		int bal = b.getbalance(1);
		System.out.println(bal);
	}

	@Override
	void getMessage() {
		System.out.println("Welcome to SBI!!");
	}

	@Override
	int getbalance(int custId) {
		//connnect with database to get the balance
		return 2000;
	}

}
