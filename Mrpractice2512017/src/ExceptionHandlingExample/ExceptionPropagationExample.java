package ExceptionHandlingExample;

public class ExceptionPropagationExample {
	
	void a(){
		int x=100;
		int z;
		z=x/0;
		System.out.println(z);
	}
	void b(){
		a();
	}
	void c(){
		
		try{
			b();
		}
		catch(Exception y){
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {
		
		ExceptionPropagationExample ex=new ExceptionPropagationExample();
		ex.c();
		System.out.println("Regular Flow");
	}

}
