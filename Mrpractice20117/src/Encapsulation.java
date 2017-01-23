class id{
	
	private String name;
	private String add;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}


public class Encapsulation {

	public static void main(String[] args) {
		
		id new_id= new id();
		new_id.setName("PRAKASH");
		new_id.setAdd("Chennai");
		new_id.setAge(25);
		
		System.out.println("Name :"+new_id.getName()+ " Add :"+new_id.getAdd()+" Age :"+new_id.getAge());
		
	}

}
