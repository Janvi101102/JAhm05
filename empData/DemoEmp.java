package empData;
//import java.util.Scanner;
public class DemoEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeData ed = new EmployeeData();
		ed.setName("Janvi");
		ed.setDesignation("Manager");
		ed.setBasicSalary(40000);
		
		System.out.println(ed);
		
		EmployeeData ed2 = new EmployeeData("Jiya","HR",3456852);
		
		System.out.println(ed2);
	}

}
