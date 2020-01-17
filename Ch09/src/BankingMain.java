public class BankingMain{
	
	//MAIN
	public static void main(String[] args) {
		//Creates new accounts
		SavingsAccount sa = new SavingsAccount("Han's Savings", 100, .002);
		CheckingAccount ca = new CheckingAccount("Leia's Checking", 123);

		//Outputs current account info
		System.out.println(sa.getName() + ": " + sa.getBalance());
		System.out.println(ca.getName() + ": " + ca.getBalance());
		System.out.println();

		//Compares the two accounts
		System.out.println("Compare Accounts:");
		System.out.println(compareAccounts(sa, ca));
		System.out.println();

		//Modifies account balances
		sa.deposit(155);
		System.out.println("$155 deposited to Han's savings account");
		ca.deposit(123);
		System.out.println("$123 deposited to Leia's checking account");
		ca.withdraw(100);
		System.out.println("$100 withdrawn from Leia's checking account");
		System.out.println();

		System.out.println(sa + "\n" + ca);
		System.out.println();
		
		//Compares accounts with new balances
		System.out.println("Compare Accounts:");
		System.out.println(compareAccounts(sa, ca));
		System.out.println();
		
		//Deposits to checking account
		double dep = sa.getBalance() - ca.getBalance();
		ca.deposit(dep);
		System.out.println("$" + dep + " deposited to Leia's checking account");

		//Compares accounts with new balances
		System.out.println();
		System.out.println("Compare Accounts:");
		System.out.println(compareAccounts(sa, ca));
		
	}
	
	//Returns string that compares two bank accounts
	public static String compareAccounts(BankAccount a, BankAccount b) {
		String returnString;
		if (a.compareTo(b) == 1) {
			returnString = a.getName() + " has a larger balance.";
		}
		else if (a.compareTo(b) == -1) {
			returnString = b.getName() + " has a larger balance.";
		}
		else {
			returnString = "The balances of the accounts are the same.";
		}
		return returnString;
	}
}