package oops;

public class Student {
	
	int rollNo;//instance variable
	String name;//instance variable
	static final String School = "Payilagam";;//static variable

	public static void main(String[] args) {
		//Student.School //class level variable
		
		Student s1 = new Student();
		s1.rollNo = 1001;
		s1.name = "Siva";
		System.out.println(Student.School);
		//Student.School = "ABC";
		
		Student s2 = new Student();
		s2.rollNo = 1002;
		s2.name = "Venkatesh";
		//s2.School = "Payilagam";
		System.out.println(s2.School);
		
		Student s3 = new Student();
		s3.rollNo = 1001;
		s3.name = "Subash";
		//s3.School = "Payilagam";
		
	}

}
