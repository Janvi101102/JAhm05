package collectionExs.ListExs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_ArrayList1 {

	public static void main(String[] args) {
		
		
		/*List l2 = new LinkedList<>();
		List l3 = new Vector<>()
		*/
		
		//ArrayList a1 = new ArrayList<>();
		
		List l1 = new ArrayList<>(34); //Empty //will store 34 elements  //default size - 10
		List<Integer> l2 = new ArrayList<Integer>();
		
		l1.add(38);
		l1.add("Hello");
		l1.add(48.65);
		l1.add(68966);
		l1.add("Bye");
		
		System.out.println(l1);
		
		l2.add(38);
		l2.add(2);
		l2.add(1);
		l2.add(180);
		
		System.out.println(l2);
		
		Integer i = new Integer(12);
		
		boolean b = l1.contains(i);
		System.out.println(l1.get(3));
		System.out.println(l1.indexOf(i));
		
		System.out.println(l1.size()); //how many elements are there in the list
		
		System.out.println(b);
		
		// 1 for each loop
		
		for(Object k : l1) {
			System.out.println(k);
		}
		
		
		// by using Iterator object 
		Iterator it1 = l2.iterator();
		while(it1.hasNext()) {
			
			Integer rs  = Integer.parseInt(it1.next().toString());
			System.out.println(rs*100);
		}
		
		l1.remove(2); // to remove from list
		System.out.println(l1);
		
		
		// to sort list in order 
		
		Collections.sort(l2);
		System.out.println(l2);
		
	}

}
