package method;

public class StudentController {

	public static void main(String[] args) {
		StudentModel sm = new StudentModel();
		sm.rollNo = 100;
		sm.name ="Sathish";
		
		StudentModel sm2 = new StudentModel();
		sm2.rollNo = 200;
		sm2.name ="Venkatesh";
		
		StudentView sv = new StudentView();
		sv.display(sm.rollNo, sm.name);
		sv.display(sm2.rollNo, sm2.name);

	}

}
