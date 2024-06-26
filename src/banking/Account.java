package banking;

public class Account {
	public String name;
	public String Id;
	Account(String name,String Id) {
		this.name=name;
		this.Id=Id;
	}
	public int TotalAmount;
	public int previousTransaction;
	
	public static void main(String[] args) {
		

	}
	
	void getBalance() {
		
		System.out.println(TotalAmount);
	}

}
