public class Person implements Comparable<Person> {
	
	private int id;
	private String name;
	
	public Person( int id, String name ) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		//return "(ID: " + id + "; Name: " + name + ")";
		return id + ": " + name;
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

	@Override
	public int compareTo(Person p2) {
		
		// sort by name
		return this.getName().compareTo(p2.getName());
		
		/*
		// sort by number
		if( this.getId() > p2.getId() ) {
			return 1;
		}
		else if( this.getId() < p2.getId() ) {
			return -1;
		}
		else {
			return 0;
		}
		*/
	}
}