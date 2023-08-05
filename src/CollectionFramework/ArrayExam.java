package CollectionFramework;

import java.util.ArrayList;

public class ArrayExam {

	public static void main(String[] args) {
	
		int a [] = {2,4,1,5,3};
		for(int value :a) {
			System.out.println(value);
		}
		
		
		
		   ArrayList<Integer> Java_Class = new ArrayList<Integer>();
		    Java_Class.add(1);
		    Java_Class.add(5);
		    Java_Class.add(6);
		    Java_Class.add(2);
		    Java_Class.add(12);
		    Java_Class.add(56);
		    Java_Class.add(43);
		    Java_Class.add(28);
		    System.out.println(Java_Class);
		    
		    int max = Java_Class.get(0);
		    for (int i = 0; i < Java_Class.size(); i++) {
		        if(max < Java_Class.get(i)){
		            max = Java_Class.get(i);
		        }
		    }
		    System.out.println("Max = "+ max);
		
	}

}
