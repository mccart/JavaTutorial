import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		File file = new File("test.txt");
		
		// Java 6 or below...
		
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			int count = 1;
			while( (line = br.readLine()) != null ) {
				// should use stringBuilder if collecting lines...
				System.out.printf("%2d: %s\n", count, line);
				count++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.printf("File not found: %s\n", file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.printf("Unable to read file: %s\n", file.toString());
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.printf("Unable to close file: %s\n", file.toString());
			}
			catch (NullPointerException ex) {
				// file was probably never opened
			}
		}
	}
}
