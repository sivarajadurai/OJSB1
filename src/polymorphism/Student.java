package polymorphism;

public class Student {
	int rollNo;
	String Name;
	
	public Student(int rollNo,String Name){
		this.rollNo =  rollNo;
		this.Name = Name;
		display();
	}
	
	void display() {
		//display();
		System.out.println("Student Name : "+Name);
		System.out.println("Studet rollnumber : "+rollNo);
	}

}
