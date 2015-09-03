
public class Truthy {
	
	public static void main(String[] args) {
		int x = 7;
		//compile error...
		//assert(x == 6) ? "x == 6" : "x != 6";
		// fix?
		System.out.println(x == 6 ? "x == 6" : "x != 6");
		// outputs x! = 6
	}
}

// does not compile - assert???
// cannot convert String to Boolean