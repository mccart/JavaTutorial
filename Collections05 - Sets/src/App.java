import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		// HashSet - no order
		// Set<String> s1 = new HashSet<String>();

		// LinkedHashSet - retains order inserted
		// Set<String> s1 = new LinkedHashSet<String>();

		// TreeSet - natural order, alphbetical in this case
		Set<String> s1 = new TreeSet<String>();
		
		if(s1.isEmpty()) {
			System.out.println("Set is empty at start");
		}

		s1.add("dog");
		s1.add("cat");
		s1.add("bird");
		s1.add("fish");
		s1.add("squirrel");
		s1.add("chipmunk");
		
		if(s1.isEmpty()) {
			System.out.println("Set is empty after adding");
		}
		s1.add("cat"); // adding dup does nothing

		System.out.println(s1);

		// Iteration
		for (String e : s1) {
			System.out.println(e);
		}

		// has item?
		if (s1.contains("aardvark")) {
			System.out.println("Contains aardvark");
		} 
		
		if (s1.contains("cat")) {
			System.out.println("Contains cat");
		}
		
		
		// Intersection //////////////////////////////////////
		
		Set<String> s2 = new TreeSet<String>();
		
		s2.add("dog");
		s2.add("cat");
		s2.add("bird");
		s2.add("giraffe");
		s2.add("monkey");
		s2.add("ant");
		
		Set<String> intsec = new HashSet<String>(s1);
		System.out.println(s1);
		System.out.println(intsec);	// [squirrel, bird, cat, chipmunk, fish, dog]
		
		intsec.retainAll(s2);		// intersection of s1 & s2
		System.out.println(intsec);	// [bird, cat, dog]
		
		Set<String> diff1 = new HashSet<String>(s1);
		diff1.removeAll(s2);		// stuff in s1 not in s2
		System.out.println(diff1);	// [squirrel, chipmunk, fish]
		
		Set<String> diff2 = new HashSet<String>(s2);
		diff2.removeAll(s1);		// stuff in s2 not in s1
		System.out.println(diff2);	// [monkey, ant, giraffe]

	}
}
