package com.siva.program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LambdaExample{

	
	public static void main(String[] args) {
		int radius = 34;
		
		//one time use
		//Annoymous class
		Drawable d = new Drawable() {
			@Override
			public void draw() {
				System.out.println("Circle : "+radius );
			}

	
		};
		d.draw();
		
		//lamda expresion
		  Drawable d2=()->{  
	            System.out.println("sphere "+radius);  
	        };  
	        d2.draw();
	
	        List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	          
	        list.forEach(  
	            (n)->System.out.println(n)  
	        );  
	        
	        
	        Set <String> s=new HashSet<String>();  
	        s.add("java");  
	        s.add("python");  
	        s.add("php");  
	        s.add("javascript");  
	          
	        s.forEach(  
	            (n)->System.out.println(n)  
	        ); 
	}



}
