package staticfunctionEx;

public class StaticFunction {
	private int salary;
	private static int cnt;
	
	
	public void showData(int k) {
		
	}
	public static void showData() {
		//salary = 23000; non static variables are not allowed
		cnt++;
		System.out.println(cnt);
	}
}
