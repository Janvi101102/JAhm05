package collectionExs.ListExs;
import java.util.*;
public class VectorEx {

	public static void main(String[] args) {
		
		Vector<String>  vr = new Vector<String>();
		
		vr.add("Red");
		vr.add("Yellow");
		vr.add("Green");
		vr.add("Blue");
		
		System.out.println(vr);
		
		/*Iterator ir = vr.iterator();
		
		while(ir.hasNext()) {
			
			System.out.println(ir.next());
		}*/
		
		vr.forEach(element -> System.out.println(element.toUpperCase())); //lambda expression
		
		vr.remove(0);
		
		vr.forEach(element -> System.out.println(element.toUpperCase()));
		
	}

}
