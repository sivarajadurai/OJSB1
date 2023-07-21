package inheritance;

public class Car extends Vehicle {
	
	//If parent has default constructor, invoke automatically
	//If parent has only parameter constructor, invoke manually by using super()
	
	Car(){
		super("red");
		System.out.println("Car constructor");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.speed();
	}

}
