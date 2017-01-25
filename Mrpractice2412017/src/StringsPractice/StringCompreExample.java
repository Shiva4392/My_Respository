package StringsPractice;

public class StringCompreExample {

	public static void main(String[] args) {

		String s1="Ganguly";
		String s2="Kholi";
		String s3="Kholi";
		String s4=new String("Ganguly");
		String s5="GANGULY";
		
		System.out.println("-------------------------");
		System.out.println("EQUALS MTD");
		System.out.println("-------------------------");
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println("-------------------------");
		
		System.out.println("== OPERATOR MTD");
		System.out.println("-------------------------");
		System.out.println(s1==s4);
		System.out.println(s1==s2);
		System.out.println("-------------------------");

		System.out.println("COMPARETO() MTD");
		System.out.println("-------------------------");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		System.out.println("-------------------------");

		System.out.println("SUBSTRING");
		System.out.println("-------------------------");
		System.out.println(s1.substring(0,2));
		System.out.println(s1.substring(2));
		System.out.println("-------------------------");
		
		System.out.println("CASE CONVERTION");
		System.out.println("-------------------------");
		System.out.println(s1.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println("-------------------------");
		
		
	}

}
