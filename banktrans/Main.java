package banktrans;

public class Main {

	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount(1000);
        CheckingAccount checking = new CheckingAccount(500);

        Transaction transaction = new Transaction(5.00);

        transaction.performTransaction(savings, 200, true);  // Deposit in Savings
        transaction.performTransaction(checking, 100, false); // Withdraw from Checking

        System.out.println("Total accounts created: " + Bank.getTotalAccounts());
	}

}
