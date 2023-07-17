package polymorphism;

public class StudentController {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		a[0] =4;
		
		Student s[] =  new Student[5];//Array of object
		s[0]= new Student(1,"Ravi");
		s[1]=new Student(2,"Arun");
		s[2]=new Student(3,"Vignesh");
		s[3]=new Student(4,"Akash");
		s[4]=new Student(5,"Ganesh");
		
		s[4].display();
		
		

	}

}
