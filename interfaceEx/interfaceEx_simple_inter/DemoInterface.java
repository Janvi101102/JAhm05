package interfaceEx_simple_inter;
//public class DemoInterface extends TestInterface implements Printable,BaseInterface

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface ti = new TestInterface();
		System.out.println(TestInterface.msg);
		
		ti.showData();
	}

}
