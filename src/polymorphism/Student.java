package polymorphism;

public class Student {
	int rollNo;
	String Name;
	
	Student(int rollNo,String Name){
		this.rollNo =  rollNo;
		this.Name = Name;
	}
	
	void display() {
		System.out.println("Student Name : "+Name);
		System.out.println("Studet rollnumber : "+rollNo);
	}

}
