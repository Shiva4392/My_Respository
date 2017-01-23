
class bank{
	
	int Interest_rate(){
		return 0;
	}
}

class kvb extends bank{
	int Interest_rate(){
		return 5;
	}
}

class sbi extends bank{
	int Interest_rate(){
		return 8;
	}
}

class canara extends bank{
	int Interest_rate(){
		return 12;
	}
}
class Polymorphism_Runtime {

	public static void main(String[] args) {
		
		bank b1=new kvb();
		bank b2=new sbi();
		bank b3=new canara();
		
		System.out.println("The interest rate of kvb bank is :"+b1.Interest_rate());
		System.out.println("The interest rate of sbi bank is :"+b2.Interest_rate());
		System.out.println("The interest rate of canara bank is :"+b3.Interest_rate());
	}

}
