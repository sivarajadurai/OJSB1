package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a  = s.nextInt();
		System.out.println(a);
		
		Scanner s1;
		try {
			s1 = new Scanner(new FileReader("/home/siva/Online_classes/siva.txt"));
			while (s1.hasNext()) {
	            System.err.println(s1.next());
	        }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
