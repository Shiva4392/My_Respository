package Collection_Frame_Work_Set;

import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		
		
	lhset.add(new String("Apple"));
	lhset.add("Mango");
	lhset.add("Grapes");
	lhset.add("Straw");
	lhset.add("Orange");
	lhset.add("Apple");
	lhset.add("Mango");
	lhset.add(null);
	lhset.add(null);
	lhset.add(null);

	
System.out.println(lhset);
	}

}