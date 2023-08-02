package wrapperclass;

public class Example {

	public static void main(String[] args) {

		int a = 5;
		Integer i = Integer.valueOf(a); // Boxing - It will create Integer object and store 5
		// Integer k = new Integer(a);
		int b = i.intValue();// Unboxing - taking the value form the Integer box
		System.out.println(b);
		
		String s1 = new String("java");
		String s2 = "java";
		
		//Auto boxing
		
		Integer x = 10;//automatically boxing
		int y = x;//automatically unboxing
		
		Byte bytes = 12;
		Short s = 12;
		Float f = 23.5f;
		Double d = 23.6;
		Boolean bool = true;
		Character c = 'A';
		Long l = 345L;
		

	}

}
