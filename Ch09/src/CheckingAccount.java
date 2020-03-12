/**
 *  Simulates a checking account on which every
 * 			withdrawal and deposit will result in a transaction fee.
 * @author Love
 * @version July 19, 2017
 */
public class CheckingAccount extends BankAccount{
	private static final double TRANSACTION_FEE = .5;
	private int numTrans;
	
	public CheckingAccount(String n, double b) {
		super(n, b);
		numTrans = 0;
	}
	
	/**
	 * Deposits an amount into the account.
	 * Increments the number of transactions.
	 * @param amount amount deposited
	 */
	@Override
	public void deposit(double amount) {
		super.deposit(amount);
		numTrans++;
	}
	
	/**
	 * Withdawals an amount from the account.
	 * Increments the number of transactions.
	 * @param amount amount withdrawn
	 */
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		numTrans++;
	}

	/**
	 * Assesses the total fees of the checking account
	 */
	public void deductFees() {
		super.withdraw(numTrans * TRANSACTION_FEE);
		numTrans = 0;
	}
	
	/**
	 * Returns the number of transactions
	 * @return the number of transactions
	 */
	public int getTransactionCount() {
		return numTrans;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\tNumber of Transacitons: " + numTrans;
	}
}