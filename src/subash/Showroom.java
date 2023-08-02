package subash;

class Showroom {
	static class Siva{
		void make() {
			System.out.println("Training");
		}	
	}
	
	
	public static void main(String args[]) {
		//Showroom sr = new Showroom();
		Siva s = new Siva();
		s.make();
		
		
		Bike b;
		b = new Honda();
		System.out.println("Honda bike : Rs" + b.Price());
		//System.out.println("Honda cc :"+b.cc());
		b = new Splender();
		System.out.println("Splender bike : Rs" + b.Price());
		b.gear();
		Honda h = new Honda();
		h.Price();
		h.cc();
		h.gear();
	}
}
/*Child object stores in parent reference
 * using this reference you can access only overriden method
 * we cannot access the child non overriden method
 * we cannot access the parent methods
 */

