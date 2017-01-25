package Collection_Frame_Work_Map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(183, "Ganguly");
		hm.put(200, "Sachin");
		hm.put(182, "Kholi");
		hm.put(209, "Shewag");
		System.out.println(hm);
	
		hm.remove(200);
		
		System.out.println(hm);

		
	}

}
