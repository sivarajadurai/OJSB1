package Recurssion;

public class Print {
	int i =1;
	
	void disp() {//loop alternative- speed
		System.out.println(i);
		i++;
		if(i<5)
			disp();
	}

	public static void main(String[] args) {
		Print p = new Print();
		p.disp();
		p.print(1);
	}
	
	
	void print(int k) {
		System.out.println(k);
		k++;
		if(k<5)
			print(k);
	}

}
