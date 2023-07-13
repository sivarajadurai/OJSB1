package oops;

  class Bicycle {
	  
	  //nested class
	 private class bike{
		  
	  }
	// Reuse and easy to maintain
	// Template or blue print of an object
	// Define state and behavior
	// state - variable and behavior - method
	// void - nothing to return
	// instance - Object

	public static void main(String arg[]) {
//		  float petrolprice = 105.6f;
//		  System.out.println(petrolprice);
//		  System.out.println(petrolprice);
//		  System.out.println(petrolprice);
		Bicycle cycle = new Bicycle();// new - memory allocation to store object in heap memory
		//Method which has classname - Constructor
		cycle.fact();
		cycle.fact();
		cycle.fib();
	}

	// instance method
	void fact() {
		int a = 5;
		int fact = 1;
		for (int i = 1; i < a; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
	
	void fib() {
		
	}

}
