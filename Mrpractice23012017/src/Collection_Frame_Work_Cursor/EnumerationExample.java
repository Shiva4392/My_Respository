package Collection_Frame_Work_Cursor;

import java.util.*;

public class EnumerationExample {

	public static void main(String[] args) {
		
		Enumeration<String> days;
		Vector<String> daynames=new Vector<String>();
		
		daynames.add("SUN");
		daynames.add("MON");
		daynames.add("TUE");
		daynames.add("WED");
		daynames.add("THU");
		daynames.add("FRI");
		daynames.add("SAT");
		
		days=daynames.elements();
		
		while(days.hasMoreElements()){
		System.out.println(days.nextElement());
		}
	}

}
