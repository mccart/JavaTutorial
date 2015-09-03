import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		// getting user input
		
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a line of text: ");
		String line = input.nextLine();
		System.out.println("You entered: " + line);
		
		System.out.println("Enter a integer: ");
		int myInt = input.nextInt();
		System.out.println("You entered: " + myInt);
		
		System.out.println("Enter a float: ");
		double myDouble = input.nextDouble();
		System.out.println("You entered: " + myDouble);

	}

}
