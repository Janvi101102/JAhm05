package staticexample;

public class DemoStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sel.welcome    static is not depend on object 
		StaticExample1 se1 = new StaticExample1();
		System.out.println(se1);
		
		StaticExample1 se2 = new StaticExample1();
		System.out.println(se2);
	
		//static is depend on class
		//we can call it by using class name
		System.out.println(StaticExample1.welcome);
	}

}
