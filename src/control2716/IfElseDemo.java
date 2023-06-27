package control2716;

public class IfElseDemo {

	public static void main(String[] args) {
		int mark = 20;
		char grade;
		if(mark >= 90) {
			grade = 'A';
		}else if(mark >= 80) {
			grade = 'B';
		}else if(mark >= 70) {
			grade = 'C';
		}else if(mark >=60) {
			grade = 'D';
		}else if(mark >= 50) {
			grade = 'E';
		}else {
			grade = 'F';
		}
		
		System.out.println(grade);

	}

}
