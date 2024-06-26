package banking;
import java.util.Scanner;



public class Account {
	public  String name;
	public String Id;
	Account(String name,String Id) {
		this.name=name;
		this.Id=Id;
	}
	public int TotalAmount=100;
	public int previousTransaction;
	
	public void showmenu() {
		System.out.println("Hello, "+name);
		System.out.println("Welcome to Lebank");
		System.out.println("================================");
		System.out.println("Enter The Operations You want...");
		System.out.println("================================");
		System.out.println("A.Withdraw");
		System.out.println("B.Deposit");
		System.out.println("C.Last Transaction");
		System.out.println("D.getBalance Info");
		System.out.println("================================");
		Scanner sc=new Scanner(System.in);
		boolean isOn=true;
		while(isOn) {
			char input=sc.next().charAt(0);
			input=Character.toUpperCase(input);
			switch(input) {
			case 'A':
				System.out.println("================================");
				int amt=sc.nextInt();
				Withdraw(amt);
				System.out.println("================================");
				break;
			case 'B':
				System.out.println("================================");
				int amt1=sc.nextInt();
				Deposit(amt1);
				System.out.println("================================");
				break;
			case 'C':
				System.out.println("================================");
				getPreviousTransaction();
				System.out.println("================================");
				break;
			case 'D':
				System.out.println("================================");
				getBalance();
				System.out.println("================================");
				break;
			case 'E':
				isOn=false;
				break;
			default :
				System.out.println("Enter Valid Option");
				break;
			}
			
		}
	}
	
	
	void getBalance() {
		System.out.println("The Total balance In your bank Account is"+TotalAmount);
	}
	void Withdraw(int amt) {
		TotalAmount-=amt;
		previousTransaction=-amt;
		System.out.println("The balanace after withdraw is "+ TotalAmount);
	}
	void Deposit(int amt) {
		TotalAmount+=amt;
		previousTransaction=amt;
		System.out.println("The balanace after Deposit is "+ TotalAmount);
	}
	void getPreviousTransaction() {
		if(previousTransaction<0) {
			System.out.println("Previous Withdraw="+Math.abs(previousTransaction));
		}
		else if(previousTransaction>0) {
			System.out.println("The money Deposit is="+Math.abs(previousTransaction));
		}
		else {
			System.out.println("No Previous transactions");
		}
	}

}
