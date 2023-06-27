package control2716;

public class Age {

	public static void main(String[] args) {
		int age = 0;
	
		if (age >= 80) {
			System.out.println("Super Senior");
		} else if (age >= 60) {
			System.out.println("Senior");
		} else if (age >= 18) {
			System.out.println("Major");
		} else if(age >= 0){
			System.out.println("Minor");
		}else {
			System.out.println("invalid age");
		}

}
}
