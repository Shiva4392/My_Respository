package StringsPractice;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("SIVA");
		sb.append(" PRAKAZZ");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("SIVA");
		sb1.insert(0,"PRAKAZZ");
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder("abcdz");
		sb2.replace(1,3,"efghijkl");
		System.out.println(sb2);
		
		StringBuilder sb3=new StringBuilder("abcdz");
		sb2.delete(1,3);
		System.out.println(sb3);
		
		StringBuilder sb4=new StringBuilder("abcdz");
		sb4.reverse();
		System.out.println(sb4);

		
	}

}
