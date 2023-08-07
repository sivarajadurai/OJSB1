package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		
		/* Set - Don't have duplicate
		 * Set - No index
		 * Set - Cannot use loop instead you can use for each or iterator
		 * Hash Set - Allow null value
		 * Hash Set - doesn't maintain any order
		 * LinkedHashSet - maintain insertion order
		 * LinkedHashSet - Allow null value
		 * Treeset - ascending order which store same type of data
		 * Treeset - doesn't allow null value
		 */
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(10);
		hs.add("java");
		hs.add(20);
		hs.add(null);
		
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(hs);
		
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(10);
		lhs.add("java");
		lhs.add(null);
		
		System.out.println(lhs);
		
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(10);
		ts.add(1);
		ts.add(3);
		ts.add(2);
		//ts.add("java");
		//ts.add(null);
		
		System.out.println(ts);
		
		TreeSet ts1 = new TreeSet();
		ts1.add("java");
		ts1.add("python");
		ts1.add("android");
		//ts1.add(null);
		
		System.out.println(ts1);
	}

}
