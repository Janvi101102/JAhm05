package hierar_Ex;

public class Employee extends Person{
	private String depart;
	
	
	
	public Employee(String nm,String ct,String depart) {
		super(nm,ct);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Employee [depart=" + depart + "]";
	}
	
}
