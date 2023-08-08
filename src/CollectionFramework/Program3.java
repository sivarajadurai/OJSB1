package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Program3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
	al.add(10);
	al.add(2);
	al.add(3);
	al.add(5);
	al.add(1);
	
	//Ascending
	TreeSet ts = new TreeSet(al);
	System.out.println(ts);
	
	Collections.sort(al);
	System.out.println(al);
	
	Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
	
		
	}

}
