package Collection_Frame_Work_Cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

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
		System.out.println("-----------------------");
		System.out.println(al);
		System.out.println("-----------------------");

		ListIterator<String> it = al.listIterator();
		
	while(it.hasNext()){
		
		System.out.println(it.next());
	}
	System.out.println("-----------------------");

	while(it.hasPrevious()){
		
		System.out.println(it.previous());
	}
	}

}
