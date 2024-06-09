package covarienttype;

public class Demo {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.display();
		
		Child c = new Child();
		c.display();
		
		Parent p1 = new Child();
		p1.display();

	}

}
