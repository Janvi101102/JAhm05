package bankactivities;

public class DemoBankTrans {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccname("Janvi");
		acc.setEmail("janvir10@gmail.com");
		acc.setBal(5000);
		
		
		System.out.println(acc);
		BankTransaction bt = new BankTransaction();
		
		bt.deposite(acc, 4000);
	
		System.out.println(acc);
		
		
		bt.withdraw(acc, 1200);
		System.out.println(acc);
	}

}
