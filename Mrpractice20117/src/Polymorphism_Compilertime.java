class example{
	
	void methodA(int num1,int num2){
		System.out.println("Mtd A:"+num1+","+num2);
	}
	
	void methodA(int num1,int num2,int num3){
		System.out.println("Mtd A:"+num1+","+num2+","+num3);
	}
	void methodA(float num1,float num2){
		System.out.println("Mtd A:"+num1+","+num2);
	}
	
}

public class Polymorphism_Compilertime {

	public static void main(String[] args) {
		example ex=new example();
		ex.methodA(10, 20);
		ex.methodA(10, 20, 30);
		ex.methodA(10.05f, 20.6f);
		
	}

}
