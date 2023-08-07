package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
	
		/*
		 * Map - Key value pair
		 * Map - any datatype key
		 * HashMap - allow null key and null value
		 * LinkedHashMap - allow null key and null value
		 * TreeMap - allow null value but doesn't allow null key
		 * TreeMap - automatically sort the key
		 */
		
		HashMap hm = new HashMap();
		hm.put(1, 10);
		hm.put(3, 10);
		hm.put(2, "java");
		hm.put("programming", "java");
		hm.put('A', "python");
		hm.put(5, null);
		hm.put(null, "data");
		System.out.println(hm);
		
		LinkedHashMap user = new LinkedHashMap();
		user.put("id", 1001);
		user.put("name", "raja");
		user.put("mobile", "98555524444");
		user.put("gender", 'A');
		user.put("status", true);
		user.put("id", 1002);
		user.put("password", null);
		user.put(null, 1222);
		System.out.println(user);
		
		//keys are sorted
		TreeMap emp = new TreeMap();
		emp.put("id", 1001);
		emp.put("name", "raja");
		emp.put("mobile", "98555524444");
		emp.put("gender", 'A');
		emp.put("status", true);
		emp.put("password", null);
		emp.put(null, 1222);
		System.out.println(emp);
		
	}

}
