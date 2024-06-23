package setExs;

import java.util.TreeSet;
import collectionExs.ListExs.Color;
public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<String> tr1 = new TreeSet<String>();
		TreeSet<Integer> tr2 = new TreeSet<Integer>();
		TreeSet<Color> tc1 = new TreeSet<Color>();
		
		System.out.println("String TreeSet");
		
		tr1.add("Peocock");
		tr1.add("Parrot");
		tr1.add("Duck");
		tr1.add("Sparrow");
		
		tr1.forEach(t -> System.out.println(t));

		tr2.add(6);
		tr2.add(56);
		tr2.add(56);
		tr2.add(5);
		tr2.add(7);
		
		System.out.println("Integer TreeSet");
		
		tr2.forEach(t -> System.out.println(t));
		
		System.out.println("SubSet of Integer TreeSet");
		
		System.out.println(tr2.subSet(5,true, 7,true));
	}

}
