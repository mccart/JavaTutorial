
class Machine {
	private String name;
	private int code;
	
	public Machine() {
		this("Arnie", 0);
	}	
	
	public Machine(String name) {
		this(name, 0);
	}
	
	public Machine(String name, int code) {
		this.name = name;
		this.code = code;
		speak(name, code);
	}
	
	private void speak(String text, int code) {
		System.out.println("Constructor " + text + " running! " + code);
	}
}

public class App {
	public static void main(String[] args) {
		Machine m1 = new Machine();
		Machine m2 = new Machine("Bertie");
		Machine m3 = new Machine("Chalky", 7);

	}
}
