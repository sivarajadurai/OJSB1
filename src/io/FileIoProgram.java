package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIoProgram {

	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("/home/siva/Online_classes/siva.txt");
			int c;
			while ((c = in.read()) != -1) {
				char ch = (char)c;
                System.out.println(c);
            }
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
