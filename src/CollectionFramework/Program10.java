package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program10 {

	public static void main(String[] args) {

		HashMap<String, Integer> hp = new HashMap();

		hp.put("Ramesh", 80);
		hp.put("Ravi", 60);
		hp.put("Muthu", 90);
		hp.put("Pradeep", 40);

		TreeMap tm = new TreeMap(hp);
		System.out.println(tm);

		ArrayList<Integer> al = new ArrayList();

		for (Map.Entry<String, Integer> m : hp.entrySet()) {
			al.add(m.getValue());
		}
		System.out.println(al);

		Collections.sort(al, Collections.reverseOrder());

		System.out.println(al);// 40 60 80 90

		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Integer value1 : al) {// 40 60
			for (Map.Entry<String, Integer> m1 : hp.entrySet()) {
				int value2 = m1.getValue();
				if (value1 == value2) {
					sortedMap.put(m1.getKey(), value1);
				}

			}
		}
		System.out.println(sortedMap);
	}

}
