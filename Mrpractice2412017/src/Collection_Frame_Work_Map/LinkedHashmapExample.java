package Collection_Frame_Work_Map;

import java.util.LinkedHashMap;

public class LinkedHashmapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		hm.put(183, "Ganguly");
		hm.put(200, "Sachin");
		hm.put(182, "Kholi");
		hm.put(209, "Shewag");
		System.out.println(hm);
	
		hm.remove(200);
		
		System.out.println(hm);
	}

}
