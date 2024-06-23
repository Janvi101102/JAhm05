package collectionExs.queueEx;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueEx1 {

	public static void main(String[] args) {
		
		Deque<String> dq1 = new ArrayDeque<String>();
		dq1.add("Rose");
		dq1.add("Lotus");
		dq1.add("Habiscus");
		
		System.out.println(dq1);
		
		dq1.addFirst("Tulip");
		
		System.out.println(dq1);
		dq1.pollLast();
		System.out.println(dq1);
	}

}
