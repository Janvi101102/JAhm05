package treeset;


import java.util.Scanner;
import java.util.TreeSet;

public class DivisibleBy5TreeSet {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> divisibleBy5Set = new TreeSet<>();

        System.out.println("Enter numbers. The program will add numbers divisible by 5 to the TreeSet until it contains 5 such numbers.");

        while (divisibleBy5Set.size() < 5) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 5 == 0) {
                divisibleBy5Set.add(number);
                System.out.println(number + " is divisible by 5 and has been added to the TreeSet.");
            } else {
                System.out.println(number + " is not divisible by 5 and will not be added.");
            }
        }

        System.out.println("TreeSet of numbers divisible by 5: " + divisibleBy5Set);
        scanner.close();
    }
}
