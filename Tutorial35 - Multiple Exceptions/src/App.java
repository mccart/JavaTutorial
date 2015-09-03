import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {

	//public static void main(String[] args) throws IOException, ParseException {
	public static void main(String[] args) {
		
		Test test = new Test();
		
		/*
		try {
			test.run();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File not found");
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Cant parse file");
		}
		*/

		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		*/
		
		// Any exceptions (Parent class)...
		try {
			test.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			test.input();
		} catch (FileNotFoundException e) {   // child of IOException
			e.printStackTrace();
		} catch (IOException e) {	// Parent
			e.printStackTrace();
		}

	}

}
