import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		
		//if( l1 > l2 ) {		// short to long strings
		if( l1 < l2 ) {			// long to short strings 
			return 1;
		}
		//else if (l1 < l2 ) {
		else if (l1 > l2 ) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// alphabetical sort
		return s1.compareTo(s2);
	}
}	

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// reverse alphabetical sort
		//return -s1.compareTo(s2);
		return s2.compareTo(s1);
	}
}
	
public class App {

	public static void main(String[] args) {
		
		////////// Sorting strings ///////////////////////
		List<String> a1 = new ArrayList<String>();
		
		a1.add("elephant");
		a1.add("tiger");
		a1.add("cat");
		a1.add("lion");
		a1.add("snake");
		a1.add("mongoose");

		//Collections.sort(a1);
		//Collections.sort(a1, new StringLengthComparator());
		//Collections.sort(a1, new AlphabeticalComparator());
		Collections.sort(a1, new ReverseAlphabeticalComparator());
		
		for(String a: a1) {
			System.out.println(a);
		}
		
		////////// Sorting numbers ///////////////////////
		List<Integer> n1 = new ArrayList<Integer>();
		
		n1.add(3);
		n1.add(36);
		n1.add(73);
		n1.add(40);
		n1.add(1);
		
		//Collections.sort(n1);
		
		// using anonymous class on Comparator to override compare method
		Collections.sort( n1, new Comparator<Integer>() {

			@Override
			public int compare(Integer n1, Integer n2) {
				return -n1.compareTo(n2);
			}
			
		});
		
		for(Integer n: n1) {
			System.out.println(n);
		}
		
		////////// Sorting objects ///////////////////////
		List<Person> p1 = new ArrayList<Person>();
		p1.add(new Person(1, "Joe"));
		p1.add(new Person(3, "Bob"));
		p1.add(new Person(4, "Clare"));
		p1.add(new Person(2, "Sue"));
		
		/*
		// anonymous class adding compare method
		Collections.sort( p1, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				
				// sort by name
				return p1.getName().compareTo(p2.getName());
				
				// sort by number
				//if( p1.getId() > p2.getId() ) {
				//	return 1;
				//}
				//else if( p1.getId() < p2.getId() ) {
				//	return -1;
				//}
				//else {
				//	return 0;
				//}
				
			}
		});
		*/
		
		// after Person implements Comparable with method compareTo
		Collections.sort(p1);
			
		for( Person p: p1 ) {
			System.out.println(p);
		}

	}
}
