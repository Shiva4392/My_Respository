package Collection_Frame_Work_Cursor;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayCollectionsExample {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		
	al.add(new String("Apple"));
	al.add("Mango");
	al.add("Grapes");
	al.add("Straw");
	al.add("Orange");
	al.add("Apple");
	al.add("Mango");
	al.add(0,"Siva");
	System.out.println(al);
	Collections.reverse(al);
	System.out.println(al);
	
	}

}
