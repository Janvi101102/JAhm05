package hierar_Ex;

public class Student extends Person {
	private String div;
	
	//Default Constructor
	public Student() {
		super(); // It will call parent class default constructor
		System.out.println("I am Student");
	
	}
	
	//Parameterized Constructor
	public Student(String nm,String ct,String div) {
		super(nm,ct);
		this.div = div;
	}


	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	@Override
	public String toString() {
		return "Name = " + getName() + " City = " +getCity() + " Div = " + div;
	}
	
}
