package memberInheritEx;

public class Main {
	public static void main(String[] args) {
        // Creating an Employee object and assigning values
        Employee employee = new Employee();
        employee.name = "Janvi Rathod";
        employee.age = 21;
        employee.phoneNumber = "+91 7485968966";
        employee.address = "123 Surat, Gujarat";
        employee.salary = 50000;
        employee.specialization = "Software Development";

        // Creating a Manager object and assigning values
        Manager manager = new Manager();
        manager.name = "Shraddha Patel";
        manager.age = 30;
        manager.phoneNumber = "+";
        manager.address = "129, Ahmedabad, Gujarat";
        manager.salary = 70000;
        manager.department = "Human Resources";

        // Printing the details of the employee
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Specialization: " + employee.specialization);
        employee.printSalary();

        // Printing the details of the manager
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}
