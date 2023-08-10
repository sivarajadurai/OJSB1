package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutprogram {

	public static void main(String[] args) {
		String s = "This is first program";
		try {
			FileOutputStream out = new FileOutputStream("/home/siva/Online_classes/subash/java.txt");
	out.write(s.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
