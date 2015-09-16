import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a command: ");
		String text = input.nextLine();
		
		switch(text.toLowerCase()) {
		case "start":
			System.out.println("Starting...");
			break;
			
		case "stop":
			System.out.println("Stopping...");
			break;
			
		default:
			System.out.println("Command not recognized...");
		}

	}
}
