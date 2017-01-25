package ExceptionHandlingExample;

public class ExceptionTryCatchFinal {

	public static void main(String[] args) {
		
		try{
			try{
		int data=50/10;
		System.out.println(data);
		}
		catch(Exception e){
			System.out.println("Arithmetic Error");
		}
			try{
				int a[]=new int[5];
				a[5]=4;
			}
		catch(Exception e){
			System.out.println("Out of boundary");
		}
		}
		catch(Exception e){
			System.out.println("Handeled");
		}
		finally{
			System.out.println("Finally block always executed");
		}
		System.out.println("Remaining Code.....");
	}

}
