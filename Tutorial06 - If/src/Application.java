public class Application {
	public static void main(String[] args) {
		
		boolean cond = 1 < 6;  // > != == 
		System.out.println(cond);
		
		int myInt = 0;
		
		while( myInt < 31 ) {

			if (myInt < 10) {
				System.out.println(myInt + " < 10 ");
			} else if (myInt > 20) {
				System.out.println(myInt + " > 20 ");
			} else {
				System.out.println(myInt + " >= 10 <= 20 ");
			}
			
			myInt += 5;
		}

	}

}
