package pack2;

import pack1.Person;

public class Child extends Person{
	
	void access() {
		
		//Child from other package can access protected and public
	//	System.out.println(id);
				System.out.println(mobile);
				System.out.println(name);
				//System.out.println(p.passcode);
	}

}
