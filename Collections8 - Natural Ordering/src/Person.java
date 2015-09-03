public class Person implements Comparable<Person> {
	
	private String name;
	
	public Person( String name ) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person p2) {
		
		// can access private p2 name within class...
		
		// string natural order
		//return name.compareTo(p2.name);
		
		// string reverse alpha order
		//return -name.compareTo(p2.name);
		
		int l1 = name.length();
		int l2 = p2.name.length();
		
		if( l1 > l2 ) {
			return 1;
		}
		else if( l1 < l2 ) {
			return -1;
		}
		else {
			
			//return 0;  unpredictable because 
			// .equals() and .compareTo() do not have same logic
			// here first equal length name preserved (other discard)
						
			return name.compareTo(p2.name);
			// this would sort equal length name together
			
		}
	}
	
}