class Person {
	private int id;
	private String name;
	
	public Person() {
		//super();
		this.id = 0;
		this.name = null;
	}
	
	public Person(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
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

		Person p1 = new Person(5, "Bob");
		Person p2 = new Person(8, "Sue");
		Person p3 = new Person(8, "Sue");
		Person p4 = new Person();

		System.out.println(" -- Object --");
		System.out.println(p1 == p2);	// false
		System.out.println(p2 == p3);	// false
		p4 = p1;
		System.out.println(p1 == p4);	// true
		
		// before .equal override - false
		// after .equal override - true
		System.out.println(p2.equals(p3));

		Double v1 = 7.2;
		Double v2 = 7.2;
		System.out.println(" -- Double --");
		System.out.println(v1 == v2);		// false
		System.out.println(v1.equals(v2));	// true
		
		Integer n1 = 6;
		Integer n2 = 6;
		System.out.println(" -- Integer --");
		System.out.println(n1 == n2);		// true
		System.out.println(n1.equals(n2));	// true

		String t1 = "Hello";
		String t2 = "Hello";
		String t3 = "Helloasdf".substring(0, 5);
		System.out.println(" -- String --");
		System.out.println(t1 == t2);	// same reference object
		System.out.println(t3 + " : " + (t1 == t3));
		System.out.println(t3 + " : " + (t1.equals(t3)));
		
		// use .equals to compare content
		// use == to compare object or reference
		
		System.out.printf("\n%s", new Object());
		System.out.printf("\n%s", new Object());
		
	}
}
