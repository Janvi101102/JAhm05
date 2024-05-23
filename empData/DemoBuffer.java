package empData;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoBuffer
{

	public static void main(String[] args) 
	{
		try
		{
			int salary;
			String name;
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter Name");
		
			name = br.readLine();
		
			System.out.println("Enter Salary");
		
			salary = Integer.parseInt(br.readLine());
		
			System.out.println("Name: " + name + " " + "Salary: " + salary + " ");
		}catch(Exception e) {
			System.out.println("Error");
		}
	}
}