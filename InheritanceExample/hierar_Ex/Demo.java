package hierar_Ex;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student();
		
		
		st.setName("Janvi");
		st.setCity("Surat");
		st.setDiv("B");
		
		System.out.println(st);
		
		Student s2 = new Student("Vidhi","Vadodra","A");
		System.out.println(s2);
		//Person p = new Person();
		//p = new Employee();
		//System.out.println(p instanceof Employee);//The specific (p) is a object of class(Employee) or not.
		Employee em = new Employee("Jiya","Ahmedabad","IT");
		System.out.println(em);
	}

}
