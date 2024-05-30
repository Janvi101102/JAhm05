package banktrans;

public class Transaction {
	private final double transactionFee;

    public Transaction(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public final void performTransaction(Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
        account.withdraw(transactionFee);
        System.out.println("Transaction completed. Current balance: " + account.getBalance());
    }

    public double getTransactionFee() {
        return transactionFee;
    }
}
