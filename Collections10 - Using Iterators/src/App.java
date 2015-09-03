import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> a1 = new LinkedList<String>();

		a1.add("fox");
		a1.add("cat");
		a1.add("dog");
		a1.add("rabbit");

		// iterator...
		// have to use this to be able remove item while looping
		// cannot do that in for each loop
		Iterator<String> it = a1.iterator();
		while (it.hasNext()) {
			String a = it.next();
			System.out.println("it.next: " + a);
			if( a == "cat" ) {
				it.remove();
			}
		}

		// to be able to add in loop need to use ListIterator instead
		
		System.out.println(a1);

		// modern iterator, Iterator is behind the scene...
		for (String a : a1) {
			System.out.println(a);
		}

	}

}
