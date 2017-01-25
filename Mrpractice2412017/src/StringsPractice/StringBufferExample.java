package StringsPractice;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("SIVA");
		sb.append(" PRAKAZZ");
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("SIVA");
		sb1.insert(0,"PRAKAZZ");
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer("abcdz");
		sb2.replace(1,3,"efghijkl");
		System.out.println(sb2);
		
		StringBuffer sb3=new StringBuffer("abcdz");
		sb2.delete(1,3);
		System.out.println(sb3);
		
		StringBuffer sb4=new StringBuffer("abcdz");
		sb4.reverse();
		System.out.println(sb4);
	}
	

}
