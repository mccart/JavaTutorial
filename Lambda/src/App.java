
interface Executable {
	//void execute();
	//int execute();
	//int execute(int a);
	int execute(int a, int b);
	// lambda always associated with interface that have a single method
	// this is functional interface in jdk8
}

interface StringExecutable {
	int execute(String a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block...");
		//e.execute();
		//int value = e.execute();
		//int value = e.execute( 12 );
		int value = e.execute( 12, 13 );
		System.out.printf("Returned value: %d\n", value);
	}

	public void run(StringExecutable e) {
		System.out.println("Executing code block...");
		int value = e.execute("Hello");
		System.out.printf("Returned value: %d\n", value);
	}
}


// lambda expressions....

// r1.run( () -> System.out.println("Hello there back") );

/* code block, returns void
 * 
 * () -> {
			System.out.println("Passed lambda expression..."); 
			System.out.println("Hello there back"); 
		}
 */

/* code block, returns int
 * 
 * () -> {
			System.out.println("Passed lambda expression..."); 
			System.out.println("Hello there back"); 
			return 8;
		}
 */

/* code block, literal value
 * 
 * () -> {
			return 8;
		}
 */

// () -> 8  // same as above

// (int a ) -> 8

/*
 * (int a) -> {
			System.out.println("Hello there");
			return 7 + a;
		}
 */

/*
 * (a) -> {
			System.out.println("Hello there");
			return 7 + a;
		}
 */

/*
 * a -> {
			System.out.println("Hello there");
			return 7 + a;
		}
*/

/*
 * (a, b) -> {
			System.out.println("Hello there");
			return a + b;
		}
 */

public class App {

	public static void main(String[] args) {

		int c = 100;  // effectively final if not reassigned
		// c = 8;
		
		int d = 77;
		
		// lambda are a way to pass block of code to methods

		Runner r1 = new Runner();
		
		// Before lambda method - use interface and anonymous class

		r1.run( new Executable() {	// anonymous class - old way
			
			//public void execute() {
			//public int execute() {
			//public int execute( int a ) {
			public int execute( int a, int b ) {
				System.out.println("Hello there");
				int d = 88;	// ok in method anonymous class
				return c + a + b;
				// anonymous class require c "final"
			}

		});
		
		System.out.println("====================================");
		
		// using lambda expressions

		r1.run( (a, b) -> {
			System.out.println("Hello there");
			//int d = 99;  not ok for lambda, not a new scope 
			return a + b + c;
		});
		
		System.out.println("====================================");

		Executable ex = (a, b) -> {
			System.out.println("Hello there");
			//int d = 99;  not ok for lambda, not a new scope 
			return a + b + c;
		};
		
		r1.run(ex);

		System.out.println("====================================");

		Object codeblock = (Executable) (a, b) -> {
			System.out.println("Hello there");
			//int d = 99;  not ok for lambda, not a new scope 
			return a + b + c + 100;
		};
		
		r1.run( (Executable) codeblock );

		/// ArrayList sort comparable good for lambda...
		
		
	}
}
