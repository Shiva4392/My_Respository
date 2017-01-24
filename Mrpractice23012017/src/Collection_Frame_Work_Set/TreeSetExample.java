package Collection_Frame_Work_Set;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		
		
		ts.add(new String("Apple"));
		ts.add("Mango");
		ts.add("Grapes");
		ts.add("Straw");
		ts.add("Orange");
		ts.add("Apple");
		ts.add("Mango");
		
	System.out.println(ts);
	}

}
