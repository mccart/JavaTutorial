import java.util.*;

public class Primes {
	
	public static void main(String[] args) {
		
		List<Integer> p = new ArrayList<Integer>();
		
		p.add(7);
		p.add(2);
		p.add(5);
		p.add(2);
		
		//p.sort());	// error
		//Collections.sort(p);

		p.sort(null);	// fix
		
		System.out.println(p);
	}
}