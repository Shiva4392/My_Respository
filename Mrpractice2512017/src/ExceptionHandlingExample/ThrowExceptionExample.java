package ExceptionHandlingExample;

public class ThrowExceptionExample {
	
	static void v(int age){
	if(age<18) 
	
		throw new ArithmeticException("not valid");
	
	else
		System.out.println("Eligible for voting");
	}
	


	public static void main(String[] args) {
		
		v(10);
		System.out.println("REST");
	
	}

}
