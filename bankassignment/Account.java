package bankassignment;
import java.util.*;
public class Account{
	
	// Declaration of attributes
	int id;
	String firstName;
	String lastName;
	String email;
	double checkingBal;
	double savingBal;
	String password;

	//Constructor
	public Account(String FN, String LN, String email){
		this.firstName = FN;
		this.lastName = LN;
		this.email = email;
	}
	
	public void withdraw(){
		System.out.println("Select an account to withdraw from:");
		System.out.println("[C]  Checking Account");
		System.out.println("[S]  Savings Account");
		while (true){
			String choice = tools.takeTwo("C", "S");
			if (choice.equalsIgnoreCase("C")){
				System.out.println("");
				System.out.println("Checking Account Balance: $" + this.checkingBal);
			} else{
				System.out.println("U chose S");
			}
			System.out.println("How much would you like to withdraw?");

		}
	}
	public static void main(String[] args){
		Account ryan = new Account("Ryan", "Pleava", "rpleava@gmail.com");
		ryan.withdraw();
	}
	
}
