package polymorphism;
public class Arithmetic {
	int a,b;
	//constructor overloading
	Arithmetic(){
//		a =3;
//		b =4;
		this(3,4);
	}
	Arithmetic(int a, int b){
		this.a = a;
		this.b = b;
	}
	void add() {
		
		System.out.println("Sum of value "+(a+b));
	}
	public static void main(String[] args) {
		Arithmetic ar = new Arithmetic();
		ar.add();
		ar.add();
		Arithmetic ar2 = new Arithmetic(2,7);
		ar2.add();
	}

}
