package studentclass;

public class Student {
	 // Variable to hold the student's name
    private String name;

    // Constructor with no arguments, sets name to "Unknown"
    public Student() {
        this.name = "Unknown";
    }

    // Constructor with one argument, sets name to the provided value
    public Student(String name) {
        this.name = name;
    }

    // Method to get the student's name
    public String getName() {
        return name;
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student(); // No name provided
        Student student2 = new Student("Janvi"); // Name provided

        // Printing student names
        System.out.println("Student 1: " + student1.getName());
        System.out.println("Student 2: " + student2.getName());
    }
}
