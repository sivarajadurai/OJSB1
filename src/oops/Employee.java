package oops;

public class Employee {
	int empID;
	String name;
	static String Company = "TCS";
	
	//instance method
	void show() {
		System.out.println("Employee ID :"+empID);
		System.out.println("Employee Name :"+name);
		System.out.println("Company : "+Company);
	}
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee();
		e1.empID = 222;
		e1.name = "Siva";
		e1.show();
		
		Employee e2 = new Employee();
		e2.empID = 333;
		e2.name ="Muthu";
		e2.show();
	}
	

}
