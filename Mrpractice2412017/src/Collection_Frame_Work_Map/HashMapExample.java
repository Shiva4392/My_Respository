package Collection_Frame_Work_Map;

import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(183, "Ganguly");
		hm.put(200, "Sachin");
		hm.put(182, "Kholi");
		hm.put(209, "Shewag");
		System.out.println(hm);
	
		hm.remove(200);
		
		System.out.println(hm);
	}

}
