package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		
		System.out.println("ARRAY LIST");
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10);
		al.add("siva");
		al.add(23.5);
		al.add('A');
		al.add(true);
		//al.remove("siva");
		al.add(2,"java");
		al.set(3, "muthu");//replace value with given index
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println("LINKED LIST");
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(10);
		ll.add("siva");
		ll.add(23.5);
		ll.add('A');
		ll.add(true);
		ll.add(2,"python");
		ll.set(3, "Lokesh");
		System.out.println(ll);
		
		System.out.println("VECTOR");
		
		Vector v = new Vector();
		v.add(10);
		v.add(10);
		v.add("siva");
		v.add(23.5);
		v.add('A');
		v.add(true);
		v.add(2,"php");
		v.set(3, "Pradeep");
		v.add(null);
		
		System.out.println(v);

		

	}

}
