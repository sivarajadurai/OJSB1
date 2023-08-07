package CollectionFramework;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String args[]) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(10);
		pq.add(10);
		pq.add(1);
		pq.add(15);
		pq.add(2);

		System.out.println(pq.size());
		
		PriorityQueue pq1 = new PriorityQueue();
		pq1.add("java");
		//pq1.add(null);
		System.out.println(pq1);
		
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(10);
		ad.add(1);
		ad.add(15);
		ad.add(2);

		ad.remove();
		ad.remove();
		System.out.println(ad);
	}
	
	
	
}
