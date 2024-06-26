package banking;
import java.lang.reflect.WildcardType;
import java.util.Scanner;
public class Main {
	public static int TotalAmount=10000;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean isOn=true;
		while(isOn) {
			System.out.println("1.Add");
			System.out.println("2.Withdraw");
			System.out.println("Enter choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter amount to Add: ");
				int amt=sc.nextInt();
				AddAmount(amt);
				break;
			case 2:
				System.out.println("Enter Amount to withdraw: ");
				int amt1=sc.nextInt();
				withdraw(amt1);
				break;
			default:
				System.out.println("Enter a valid choice");
				
			}
		}
	}
	public static void withdraw(int amount) {
		TotalAmount-=amount;
		System.out.println(TotalAmount);
	}
	public static void AddAmount(int amount) {
		TotalAmount+=amount;
		System.out.println(TotalAmount);
	}
}
