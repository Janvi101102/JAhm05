package userdefinedexception;

public class SalaryException extends Exception {
	
	
	public SalaryException()
	{
		System.out.println("Please check salary");
	}
	public SalaryException(String msg)
	{
		super(msg);
	}
}
