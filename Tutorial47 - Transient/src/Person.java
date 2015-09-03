import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 4801633306273802062L;

	// transient - prevents from being written out when being serialized.
	// de-serialized read in as "default" value of 0 or null
	
	// Writing objects...
	// Person [id=7, name=Bob]
	// Reading objects...
	// Person [id=0, name=Bob]
			
	private transient int id;
	private String name;

	// static not serialized - Class var, not instance var 
	private static int count;
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
	
	public Person() {
		
		// will not execute when de-serializing
		setCount(++count);
		System.out.println("Default constructor");
	}
	
	public Person(int id, String name) {
		//super(); - not needed
		
		// these would be written when serializing to file
		// and read back in when de-serializing 
		this.id = id;
		this.name = name;
		
		// will not execute when de-serializing
		setCount(++count);
		System.out.println("Two arg constructor");

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", count=" + count + "]";
	}
	
}
