package arraylist;

import java.util.ArrayList;
import java.util.List;
public class EvenNoSum {
	
	public static void main(String[] args) {
	
    List<Integer> numbers = new ArrayList<>();
    
    //Adding 
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);
    numbers.add(7);
    numbers.add(8);
    numbers.add(9);
    numbers.add(10);

    
    int evenSum = 0;
    for (int number : numbers) {
        if (number % 2 == 0) {
            evenSum += number;
        }
    }

    // Print the total of all even numbers
    System.out.println("The sum of all even numbers is: " + evenSum);
}
}
