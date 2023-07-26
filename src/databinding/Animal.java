package databinding;

public class Animal {
private void doEat() {
	System.out.println("Animal is eating");
}
void walk() {
	System.out.println("walking in four legs");
}

public static void main(String agrs[]) {
	Animal a = new Animal();//static binding
	a.doEat();
}

}
