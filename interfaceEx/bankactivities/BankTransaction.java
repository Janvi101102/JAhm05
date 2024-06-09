package bankactivities;

public class BankTransaction implements Bank {

	@Override
	public void deposite(Account acc,int amt) {
		if (amt > DEPOSITE_LIMIT )
			System.out.println("Deposite not possible.. exceeds Deposite Limit");
		else 
			acc.setBal(acc.getBal() + amt);
			System.out.println("Balance Updated");
	}
	public void withdraw(Account acc,int amt) {
		if (acc.getBal() - amt >= MIN_BAL)
		{
			acc.setBal(acc.getBal() - amt);
			System.out.println("Balance Updated");
		}
		else
			System.out.println("Insufficient balance in account: " + acc);
	}
}
