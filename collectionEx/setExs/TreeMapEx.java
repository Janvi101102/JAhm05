package setExs;
import java.util.TreeMap;
public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> courses = new TreeMap<String, Integer>();
		
		courses.put("Java", 5000);
		courses.put("Python", 5000);
		courses.put("DBMS", 4000);
		courses.put("C", 4000);
		
		System.out.println(courses);
		System.out.println(courses.firstEntry());
		
		/* print one by one entries */
		
		for(TreeMap<String,Integer> c: courses {
					System.out.println(c);
		}
		);
				
	}

}
