
public class App {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		int value = t1.getInitialValue();
		
		t1.doStuff(value);

		System.out.println("Starting");
		
		System.out.println("Incrementing value");
		
		value++;
		
		System.out.println(value);
		
		System.out.println("Finishing");
		
	}

}
