package collectionExs.queueEx;
import java.util.*;
public class PriorityQueueEx1 {

	public static void main(String[] args) {
		
		Queue<Integer> pq1 = new PriorityQueue<Integer>();
		
		pq1.add(56); //throws exception
		pq1.offer(78); // will not throw exception
		pq1.add(8);
		pq1.add(0);
		
		//System.out.println(pq1);
		pq1.forEach(q1 -> System.out.println(q1));
		
		//pq1.remove(78);
		//System.out.println(pq1);
	}

}
