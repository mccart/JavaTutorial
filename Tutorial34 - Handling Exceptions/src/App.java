import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {

	//public static void main(String[] args) throws FileNotFoundException {
	
	public static void main(String[] args) {

		/*
		File file = new File("test.txt");
		
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.printf("File not found: %s\n", file.toString());
		}
		System.out.println("Finished.");
		*/
		
		String fn = "text.tsxt";
		try {
			openFile(fn);
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.printf("Could not open file: %s\n", fn);
		}
		
		System.out.println("Finished.");
	}
	
	public static void openFile(String filename) throws IOException {
		File file = new File(filename);
		FileReader fr = new FileReader(file);
		// do something...
		fr.close();
	}

}
