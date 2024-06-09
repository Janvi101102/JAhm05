package interfaceEx_simple_inter;

public class TestInterface implements Printable,BaseInterface{

	@Override
	public void showData() {
		System.out.println("I am using Interface");
	}
}
