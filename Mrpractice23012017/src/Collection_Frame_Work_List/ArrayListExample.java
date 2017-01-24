package Collection_Frame_Work_List;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExample {

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
	
//System.out.println(al);
//System.out.println(al.get(0));
//System.out.println(al.get(5));
//System.out.println(al.get(4));
//System.out.println(al.get(2));
	}

}
