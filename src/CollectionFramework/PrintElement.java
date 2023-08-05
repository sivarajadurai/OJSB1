package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintElement {

	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		al.add(12);
//		al.add(23);
//		al.add(4);
//		al.add(6);
//
//		int len = al.size();
//		System.out.println("Size of ArrayList: "+len);
//		for (int i = 0; i < len; i++) {
//			System.out.println(al.get(i));
//		}
//		al.add(6);
//		System.out.println("Size of ArrayList: "+al.size());
//        System.out.println(al);
//        

		ArrayList<Integer> al = new ArrayList();
		al.add(1);
		al.add(1);
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(9);
		al.add(1);
		
		int n = al.size();// 7
//		for(int i=0;i<n;i++)
//		{
//			n=al.size();
//			for(int j=i+1;j<n;j++)
//			{
//				if(al.get(i)==al.get(j))
//				{
//					
//					al.remove(j);
//				}
//			}
//		}
//		System.out.println(al);

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(al);
		
		
		System.out.println("For each statement");
		
		//If all the element are in same type
		for(Integer i :al) {
			System.out.println(i);
			
		}

	}

}
