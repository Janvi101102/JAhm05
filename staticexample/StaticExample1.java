package staticexample;

public class StaticExample1 {
	static int cnt = 0;
	int no = 0;
	static String welcome = "Let us learn coding !!!";

	public StaticExample1() {
		cnt++;
		no++;
	}

	@Override
	public String toString() {
		return "Static Total = " + cnt + " Instance no = " + no;
	}
	
	
}
