package Collection_Frame_Work_Set;

import java.util.HashSet;

public class HashsetExample {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();
		
		
	hset.add("Apple");
	hset.add("Mango");
	hset.add("Grapes");
	hset.add("Straw");
	hset.add("Orange");
	hset.add("Apple");
	hset.add("Mango");
	hset.add(null);
	hset.add(null);
	hset.add(null);

	
System.out.println(hset);
	}

}
