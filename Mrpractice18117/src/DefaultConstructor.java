
public class DefaultConstructor {
	
	class dog{
		String d="bow bow";
		dog()
		{
			System.out.println("Dog is Barking.... \n");
		}
	}

	public static void main(String[] args) {
		
		DefaultConstructor h = new DefaultConstructor();
		dog obj1=h.new dog();
		System.out.println(obj1.d);
	}

}
