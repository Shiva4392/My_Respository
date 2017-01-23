
public class SwitchCase {

	public static void main(String[] args) {
		
		int month = 3;
		String Nameoftheday;
		
		switch (month){
		
		case 1: Nameoftheday = "SUN";
				break;
		case 2: Nameoftheday = "MON";
				break;
		case 3: Nameoftheday = "TUE";
				break;
		case 4: Nameoftheday = "WED";
				break;
		case 5: Nameoftheday = "THU";
				break;
		case 6: Nameoftheday = "FRI";
				break;
		case 7: Nameoftheday = "SAT";
				break;
	   default: Nameoftheday = "Invalid Data";
				
		}

		System.out.println(Nameoftheday);
	}

}
