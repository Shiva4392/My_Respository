package Collection_Frame_Work_Cursor;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("d");
		al.add("r");
		al.add("q");
		al.add("e");
		al.add("m");
		al.add("x");
		System.out.println("ORIGINALS");
		System.out.println(al);
		Iterator<String> it = al.iterator();
		
	while(it.hasNext()){
		
		System.out.println(it.next());
	}
		
	}
}
