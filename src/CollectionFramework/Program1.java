package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap();
		hm.put(11,"java");
		hm.put(20, "python");
		hm.put(13, "C");
		hm.put(45, "c++");
		
		Set s = hm.entrySet();//convert hashmap to set
		
		Iterator it = s.iterator();// ready to iterate
		while (it.hasNext()) {
			Map.Entry m = (Entry) it.next();// convert the map object into entry
			
			System.out.println(m.getKey());// get the key
			System.out.println(m.getValue());//get the value
		}
		
		
		//for each statement will allow to iterate when Map is generic
		for(Map.Entry<Integer,String> m :  hm.entrySet()) {
			int a = m.getKey();
			String b = m.getValue();
			System.out.println(a);
			System.out.println(b);
			System.out.println("Value : "+hm.get(a));
			
		}
		
		
		
		
		
	}

}
