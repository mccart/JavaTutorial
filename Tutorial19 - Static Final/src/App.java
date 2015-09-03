
class Thing {
	
	public final static int LUCKY_NUMBER = 7;
	
	// instance variable
	public String name;
	
	// class variable
	public static String description;
	
	public static int count = 0;
	public int id;
	
	public Thing() {
		id = count;
		count++;
	}
	
	public void showName() {
		//System.out.println(name);
		System.out.println(description + " " + id + ": " + name);
	}
	
	public static void showInfo() {
		//System.out.println("Hello");
		System.out.println(description);
		//System.out.println(name); // wont work
	}
}
	
public class App {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";
		//System.out.println(Thing.description);
		
		Thing.showInfo();
		
		System.out.println("Before: " + Thing.count);
		
		Thing t1 = new Thing();
		Thing t2 = new Thing();
		
		System.out.println("After: " + Thing.count);

		t1.name = "Bob";
		t2.name = "Sue";
		
		//System.out.println(t1.name);	
		//System.out.println(t2.name);	
		
		//t2.description = "Sue is a thing";
		//System.out.println(t1.description);
		
		t1.showName();
		t2.showName();
		
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);

	}
}
