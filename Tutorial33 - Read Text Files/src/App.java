import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		//String fileName = "C:/Users/mccart/Desktop/example.txt";
		String fileName = "example.txt";
				
		File textFile = new File(fileName);

		Scanner in = new Scanner(textFile);
		
		int count = 1;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.printf(" %2d: %s\n", count, line);
			count++;
		}
		
		in.close();
	}

}
