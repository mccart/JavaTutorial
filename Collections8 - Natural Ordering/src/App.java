import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		//List<String> l1 = new ArrayList<String>();
		List<Person> l1 = new ArrayList<Person>();
		
		//Set<String> s1 = new TreeSet<String>();
		//SortedSet<String> s1 = new TreeSet<String>();
		SortedSet<Person> s1 = new TreeSet<Person>();
		
		// both TreeSet and Collections.sort needs
		// Person implements Comparable method compareTo

		addElements(l1);
		addElements(s1);
		
		Collections.sort(l1);
		
		showElements(l1);
		System.out.println();
		showElements(s1);
		
	}
	
	// both list and set implements collection interface
	
	/*////////// String ////////////////////
	private static void addElements(Collection<String> col) {
	 	col.add("Joe");
		col.add("Sue");
		col.add("Juliet");
		col.add("Clare");
		col.add("Mike");
		col.add("Joe");
	}
	
	public static void showElements(Collection<String> col) {
		for(String s: col) {
			System.out.println(s);
		}
	}
	*/
	
	//////////// Person ////////////////////
	private static void addElements(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliet"));
		col.add(new Person("Clare"));
		col.add(new Person("Mike"));
		col.add(new Person("Joe"));
	}
	
	public static void showElements(Collection<Person> col) {
		for(Person s: col) {
			System.out.println(s);
		}
	}

}
