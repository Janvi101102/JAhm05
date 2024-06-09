package functionalinterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterface1 fc = new FunctionalInterface1();
		fc.sayHello();
		
		DefaultEx dfe = new DefaultEx();
		dfe.getID();
		dfe.showReceipt();
	}

}
