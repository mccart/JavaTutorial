import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		File file = new File("test.txt");

		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			
			String line;
			br.write("This is line one\n");
			br.write("This is line two\n");
			br.write("This is line three\n");
			br.newLine();
			br.write("...");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Unable to read file " + file.toString());
		};
	}

}
