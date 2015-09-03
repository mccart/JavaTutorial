import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		//ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
		
	}
	
	private static void doTimings(String type, List<Integer> list) {
		
		for (int i=0; i<1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		//int siz = list.size() * / 2;
		int siz = list.size() * 3 / 4;
		for (int i=0; i<1E5; i++) {
			
			// Add items at end of list
			//list.add(i);
			//Time taken: 11 ms for ArrayList
			//Time taken: 57 ms for LinkedList
			
			// Add items at start of list
			//list.add(0,i);
			//Time taken: 4871 ms for ArrayList
			//Time taken: 51 ms for LinkedList
			
			// Add items at near end of list
			list.add(list.size()-100,i);
			//Time taken: 16 ms for ArrayList
			//Time taken: 76 ms for LinkedList
			
			
// The problem is that if you add an element to a LinkedList by specifying 
// an index, the list iterates through all the objects in itself in order 
// to find the point of insertion, which is very slow. It's only faster to 
// add or remove items to linked lists if you do it using iterators. -John
			
			//list.add(siz,i);
			// Add items at siz/2 (middle) of list
			//Time taken: 2987 ms for ArrayList
			//Time taken: 24293 ms for LinkedList

			// Add items at siz*3/4 (middle) of list
			//Time taken: 2260 ms for ArrayList
			//Time taken: 28920 ms for LinkedList
		}

		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end-start) + " ms for " + type);
		
	}
}



