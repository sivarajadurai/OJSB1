package inheritance;

//single inheritance
	public class Loop extends Arithmetic {
	
		public static void main(String[] args) {
			Loop l = new Loop();
			int sod = l.sumOfDigit(234);
			System.out.println(sod);
			 l.fibonaci(5);
			 int rev = l.reverse(143);
			 System.out.println(rev);
		}
	
		int reverse(int n) {
			int s = 0;
			while(n>0) {
				int t = n%10;
				s =s*10;
				s = add(s,t);//s = s +
				n = n/10;
			}
			return s;
		}
		
		void fibonaci(int n) {
			int a = -1,b=1;
			for(int i=0;i<=n;i++) {
				int c = add(a,b);
				a = b;
				b=c;
				System.out.println(c);
			}
		}
		
		int sumOfDigit(int n) {
			int s = 0;
			while(n>0) {
				int t = n%10;
				s = add(s,t);//s = s +
				n = n/10;
			}
			return s;
		}
		
	
	}
