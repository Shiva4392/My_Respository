public class Equals_mtd {

	public static void main(String[] args) {
		
		String a="100";
		String b=a;
		boolean equal = a.equals(b);
		System.out.println(equal);
		
		String c="100";
		String d="200";
		boolean equal1 = c.equals(d);
		System.out.println(equal1);
		
		String e="100";
		String f="100";
		boolean equal2 = e.equals(f);
		System.out.println(equal2);		

	}

}
