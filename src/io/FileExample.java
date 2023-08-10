package io;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {

		File f = new File("/home/siva/Online_classes/subash/java.txt");
		// f.mkdir();
		String[] paths;
		paths = f.list();
		System.out.println(f.canRead());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// for each name in the path array
		for (String path : paths) {
			// prints filename and directory name
			System.out.println(path);
		}
	}

}
