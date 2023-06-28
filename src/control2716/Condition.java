package control2716;

public class Condition {

	public static void main(String[] args) {
		int a =4;
		if(a<5 && ++a>4) {//true && 5>4 ----->a=5
			a++;
		}
		System.out.println(a);

	}

}
