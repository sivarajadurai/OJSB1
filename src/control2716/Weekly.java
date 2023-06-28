package control2716;

public class Weekly {

	public static void main(String[] args) {
		int a=14;
		String day;
		switch(a)
		{
		case 1:
		case 7:
			day = "week end";
			//System.out.println("week end");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			day ="week day";
			///System.out.println("week days");
			break;
	
		default:
			day ="Invalid";
			//	System.out.println("invalid ");

	}
		System.out.println(day);

}
}
