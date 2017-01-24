package Collection_Frame_Work_List;
import java.util.*;

class book{
	
	int id;
	String name,author,publisher;
	int quantity;
	
	public book(int id, String name, String author,String publisher, int quantity){
		
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}


public class LinkedlistExample {

	public static void main(String[] args) {

		List<book> list = new LinkedList<book>();
		book b1=new book(101,"C and C++","PRAKASH","ORACLE",5);
		book b2=new book(102,"LINUX","MYSELF","LINUX CORP",7);
		book b3=new book(103,".NET","SIVAPRAKASh","MICROSOFT",3);
		book b4=new book(104,"CORE JAVA","SIVA","JAVA",4);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);

		System.out.println("ID NAME AUTHOR PUBLISHER QUANTITY");
		System.out.println("----------------------------------");
		
	for(book b:list){// y for here....?
		
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
	}

}
