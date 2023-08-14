package Recurssion;

import java.util.Scanner;

public class Practice {

	public static void start(int n,int i)
	{
		if(i>n)
			return;
		System.out.print(i*i*i+" ");
		start(n,i+1);
	}
	public static void main(String[] args)
	{
		Scanner io = new Scanner(
System.in
);
		int n=io.nextInt();
		start(n,1);
	}

}
