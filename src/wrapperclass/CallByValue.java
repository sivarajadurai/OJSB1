package wrapperclass;

public class CallByValue {
	
	void printInteger(Integer r) {
		System.out.println("Integer : " +r);
	}
	
	void printString(String k) {
		System.out.println(k);
	}
	void printInteger(int r) {
		System.out.println("int : "+r);
	}
	

	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		Integer i = 34;
		int k = 12;
		cbv.printInteger(i);
		cbv.printInteger(k);
		cbv.printString("siva");
		
		String age = "-20";//Value from front end
		int ageValue= 0 ;
		try {
		 ageValue = Integer.parseInt(age);
		}catch(Exception e){
			ageValue = -1;
		}
		System.out.println(ageValue);
		if(ageValue <0) {
			System.out.println("Invalid age");
		}else if(ageValue >= 18) {
			System.out.println("Citizen");
		}else {
			System.out.println("Below 18 years");
		}
		
		String price ="23.5";
		float f = Float.parseFloat(price);
		System.out.println(f);
		
		String initial = "A";
		char c = initial.charAt(0);
		System.out.println(c);
		
		String active = "true";
		boolean b = Boolean.parseBoolean(active);
		System.out.println(b);
		
	}

}
