//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {
	
	private int id;
	private String name;
	
	public Person( int id, String name ) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "(ID: " + id + "; Name: " + name + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2, "Mike");
		Person p4 = new Person(1, "Sue");
		
		Map<Person, Integer> pmap = new LinkedHashMap<Person, Integer>();
		pmap.put(p1, 1);
		pmap.put(p2, 2);
		pmap.put(p3, 3);
		pmap.put(p4, 1);
		for(Person key: pmap.keySet()) {
			System.out.println(key + ": " + pmap.get(key));
		}
		System.out.println(pmap);

		Set<Person> pset = new LinkedHashSet<Person>();
		pset.add(p1);
		pset.add(p2);
		pset.add(p3);
		pset.add(p4);System.out.println(pset);

/*		
		//Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);		// does nothing...  dup

		for(String key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		System.out.println(map);
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("dog");
		
		System.out.println(set);
*/	
		
	}

}
