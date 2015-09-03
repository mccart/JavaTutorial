
public class App {

	public static void main(String[] args) {
		long v = 16;
		System.out.println(factorial(v));
	}
	
	private static long factorial(long value) {
		System.out.println(value);
		if( value == 1 ) return 1;
		return factorial(value - 1) * value;
		
	}

}
