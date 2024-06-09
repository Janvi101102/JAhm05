package multiplecatchEx;

public class MultiCatchEx {

	public static void main(String[] args) {
		try {
            int[] a = new int[5];
            a[5] = 30 / 5;  // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Array element at index 5: " + a[5]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // Another example causing ArithmeticException
        try {
            int result = 30 / 0;  // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

	}

}
