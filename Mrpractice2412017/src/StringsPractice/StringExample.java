package StringsPractice;

public class StringExample {

	public static void main(String[] args) {

			String s1= "JAVA";
			
			char ch[]={'s','i','v','a','p','r','a','k','a','s','h'};
			
			String s2=new String(ch);
			
			String s3=new String("PRAKAZZZZ");
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);

			//Immutable String
			
			String s4="GANGULY";
			s4.concat("SOURA");
			
			System.out.println(s4);
			
			//So String Is Immutable
			
			
			String s5="GANGULY";
			s5=s5.concat(" SOURAV");
			
			System.out.println(s5);
	}

}
