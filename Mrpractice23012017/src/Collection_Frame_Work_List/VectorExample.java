package Collection_Frame_Work_List;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> vct = new Vector<String>();
		
		vct.add(new String("Apple"));
		vct.add("Mango");
		vct.add("Grapes");
		vct.add("Straw");
		vct.add("Orange");
		vct.add("Apple");
		vct.add("Mango");

		System.out.println(vct);
		
		vct.add(2,"Siva");
		System.out.println(vct);
		
		System.out.println(vct.get(3));
		System.out.println(vct.firstElement());
		System.out.println(vct.lastElement());
		System.out.println(vct.isEmpty());
		
		
		
	}

}
