package employee;

public class EmployeeModal {
	int empID;
	String Name;
	float salary;
	char department;
	String designation;
	boolean active;
	
	//if parameter construction created then default constructor removed
	EmployeeModal(int empID,String Name,
			float salary,char department,String designation,boolean active){
		this.empID = empID;
		this.Name = Name;
		this.salary = salary;
		this.department = department;
		this.designation = designation;
		this.active = active;
		
		
	}

}
