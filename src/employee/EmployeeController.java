package employee;

public class EmployeeController {

	public static void main(String[] args) {
		
		//construction used to initilize the object
		EmployeeModal em1 = new EmployeeModal(100,"Suresh",20000.4f,'A',"Developer",true);
		EmployeeModal em2 = new EmployeeModal(200,"Muthu",15000.4f,'B',"Testing",true);
		EmployeeModal em3 = new EmployeeModal(300,"Manikandan",23000.4f,'A',"Developer",false);

		EmployeeView ev = new EmployeeView();
		ev.diplay(em1);
		ev.diplay(em2);
		ev.diplay(em3);
		

	}

}
