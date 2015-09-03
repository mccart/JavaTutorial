
public class App {

	public static void main(String[] args) {
		
		App app = new App();
		
		int v = 7;
		System.out.println("B: Value is: " + v);
		app.show(v);
		System.out.println("A: Value is: " + v);

		Person p = new Person("bob");
		System.out.println();
		System.out.println("B: Person is: " + p.toString());
		app.show(p);
		System.out.println("A: Person is: " + p.toString());


	}
	
	// primitive - pass by value
	public void show(int value) {
		System.out.println("S: Value is: " + value);
		value += 1;
		System.out.println("R: Value is: " + value);
	}
	
	// object - pass by value, content by reference implicitly 
	public void show(Person person) {
		System.out.println("S: Person is: " + person.toString());

		// points to pass in object - will pass back new name
		person.setName("mike");
		System.out.println("R: Person is: " + person.toString());
		
		// points to new object - wont pass back new name
		person = new Person("connie");
		System.out.println("R: Person is: " + person.toString());
	}

}
