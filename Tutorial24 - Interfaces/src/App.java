
public class App {
	
	public static void main(String[] args) {

		Machine m1 = new Machine();
		m1.start();     // Starting...
		//m1.showInfo();  // Id: 7
		
		Person p1 = new Person("Bob");
		p1.greet();     // Hello
		//p1.showInfo();  // Name: Bob
		
		Info i1 = new Machine();
		i1.showInfo();  // Id: 7
		
		Info i2 = p1;
		i2.showInfo();  // Name: Bob
		
		System.out.println();
		
		outputInfo(m1);
		outputInfo(p1);

	}
	
	private static void outputInfo(Info info) {
		info.showInfo();
	}
}
