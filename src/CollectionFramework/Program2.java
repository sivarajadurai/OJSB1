package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Program2 {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap();
		hm.put(11,"java");
		hm.put(20, "python");
		hm.put(13, "C");
		hm.put(45, "c++");
		
		TreeMap <Integer,String> ts = new TreeMap(hm);
		System.out.println(ts);
		
		TreeSet<Integer> s = new TreeSet();
		
		for(Map.Entry<Integer,String> m :  hm.entrySet()) {
			int a = m.getKey();
			s.add(a);	
		}
		System.out.println(s);
		
		LinkedHashMap lm = new LinkedHashMap();
		
		for(Integer i:s) {
			lm.put(i,hm.get(i));
		}
		
		System.out.println(lm);
		
		
	}

}
