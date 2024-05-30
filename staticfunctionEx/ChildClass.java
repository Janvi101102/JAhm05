package staticfunctionEx;

public class ChildClass extends StaticFunction{
	
	static int k;
	
	static
	{
		k++;
		System.out.println("I am static block");
	}
}
