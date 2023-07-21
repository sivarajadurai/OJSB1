package pack1;

import pack2.NewPerson;

public class Person {

	int id;
	public String name;
	protected String mobile;
	private int passcode;
	
	 Person(int id, String name, String mobile,int passcode){
		this.id =id;
		this.name = name;
		this.mobile = mobile;
		this.passcode = passcode;
	}
	 public Person(){
		 
	 }
	
	public static void main(String args[]) {
		Person p = new Person(100,"siva","9750281070",1234);
		Friend f = new Friend();
		f.access(p);
		
		NewPerson np = new NewPerson();
		np.display(p);
	}
	
	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(mobile);
		System.out.println(passcode);
	}

}
