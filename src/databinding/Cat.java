package databinding;

public class Cat extends Animal{

	void run() {
		System.out.println("Cat is running fast");
	}
	void doEat() {
		System.out.println("Cat is eating");
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();//Static binding
		c.run();
		c.doEat();//overriden method runs
		c.walk();
		System.out.println("Dynamic binding..");
		Animal a = new Cat();//dynamic binding
		//a.doEat();//child overriden method
		a.walk();//parent method
		//a.run();//child method cannot access
		
	}
	

}
