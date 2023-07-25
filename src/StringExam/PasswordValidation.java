package StringExam;

public class PasswordValidation {
	
	private String password;
	private PasswordValidation(String password){
		this.password = password;
	}

	public static void main(String[] args) {
		
		PasswordValidation pv = new PasswordValidation("123bgA");
		pv.check();
	}
	
	private boolean upperCheck() {
		String s = this.password;
		boolean alp = false;
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c<='Z')
			{
				 alp = true;
			}
		}
		return alp;
	}
	private boolean lowerCheck() {
		String s = this.password;
		boolean alp = false;
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c >= 'a' && c<='z') 
			{
				 alp = true;
			}
		}
		return alp;
	}
	
	private boolean digitCheck() {
		String s = this.password;
		boolean digit = false;
			for(int i =0;i<s.length();i++) {
				char c = s.charAt(i);
				if(c >= '0' && c<='9') //'1'>='0' 49>=48
				{
					digit = true;
				}
			}
		return digit;
	}

	private void check() {
		
		if(digitCheck() && upperCheck() && lowerCheck()) {
			System.out.println("valide password");
		}else {
			System.out.println("Invalid password");
		}
	
	}

}
