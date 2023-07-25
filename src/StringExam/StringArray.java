package StringExam;

public class StringArray {

	public static void main(String[] args) {
		String name[]= {"Geno","Srini","Venkatesh",
				"Bala","Mathesh","Subash","Vijay","Sathish"};
		System.out.println(name[0].length());
		
		String para = "";
		for(int i=0;i<name.length;i++) {
			para = para +name[i]+ " ";
		}
		para = para.trim();
		System.out.println(para);
		}
	}


