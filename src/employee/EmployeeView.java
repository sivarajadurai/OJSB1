package employee;

public class EmployeeView {
	
	//Get parameter as object
	void diplay(EmployeeModal em) {
		System.out.println("Employee ID : "+em.empID);
		System.out.println("Employee Name : "+em.Name);
		System.out.println("Employee Department : "+em.department);
		System.out.println("Employee Designation : "+em.designation);
		
	}

}
