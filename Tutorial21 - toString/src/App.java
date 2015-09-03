
class Frog {
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		
		return String.format("%-4d: %s", id, name);
		
		/* better method...
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
		
		//return id + ": " + name;  inefficient...
	}
	
}

public class App {
	public static void main(String[] args) {
		
		//Object obj = new Object();
		//obj.   shows list of methods...
		
		Frog f1 = new Frog(7, "Freddy");
		Frog f2 = new Frog(5, "Roger");
		System.out.println(f1);
		System.out.println(f2);

	}
}
