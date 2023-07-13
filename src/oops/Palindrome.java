package oops;

public class Palindrome {
	  String temp="";
	  int len;
	  void palin(String words) {
	    len=words.length();
	    for(int i=len-1;i>=0;i--) {
	      temp+=words.charAt(i);
	      System.out.println(words.charAt(i));
	    }
	    System.out.println(words);
	    System.out.println(temp);
	    
	    if(words.equals(temp)) {
	      System.out.println("This is Palindrome");
	    }
	    
	    else {
	      System.out.println("This is Not Palindrome");
	    }
	  }
	  
	    
	  public static void main(String[] args) {
	    Palindrome obj=new Palindrome();
	    obj.palin("malayalam");

	  }

	} 