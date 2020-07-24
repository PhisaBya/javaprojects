import java.util.*;
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("Phisa", "XYZ");
		account.showMenu();

	}

}

class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	BankAccount(String cname, String cid){
		customerName = cname;
		customerID = cid;
	}
	
	void deposit(int amount){
		if(amount != 0){
			balance += amount;
			previousTransaction = amount;
		}
	}
	void withdraw(int amount){
		if(amount != 0){ 
			balance-=amount;
			previousTransaction = -amount;
		}
	}
	void getPreviousTransaction(){
		if(previousTransaction > 0){
			System.out.println("Deposited:" + previousTransaction);
		}
		else if(previousTransaction < 0){
			System.out.println("Withdrawn:" + Math.abs(previousTransaction));
		}
		else{
			System.out.println("No previous transaction");
		}
	}
	void showMenu(){
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome Customer: " + customerName );
		System.out.println("Your ID is: "+ customerID);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do{
			System.out.println("**********************************************************");
			System.out.println("Enter option:");
			System.out.println("**********************************************************");
			option = scanner.next().charAt(0);
			
			switch(option){
			case 'A':
				System.out.println("----------------------------------------------------------");
				System.out.println("Balance is: " + balance );
				System.out.println("----------------------------------------------------------");
				System.out.println('\n');
				break;
			case 'B':
				System.out.println("----------------------------------------------------------");
				System.out.println("Enter amount to deposit");
				System.out.println("----------------------------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println('\n');
				break;
			case 'C':
				System.out.println("----------------------------------------------------------");
				System.out.println("Enter amount to withdraw");
				System.out.println("----------------------------------------------------------");
				int withdraw = scanner.nextInt();
				withdraw(withdraw);
				System.out.println('\n');
				break;
			case 'D':
				System.out.println("**********************************************************");
				getPreviousTransaction();
				System.out.println("**********************************************************");
				System.out.println('\n');
				break;
			case 'E':
				System.out.println("**********************************************************");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}while(option!= 'E');
		System.out.println("Thank you");
	}
}