import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Cursor on AutoClosable and do F3 - get info on it
class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		throw new Exception("throwing...");
	}
}


public class App {

	public static void main(String[] args) {

		/* //////////////////////////////////////////  
		Temp t1 = new Temp();
		System.out.println("Before try t1.close()...");
		
		try {
			t1.close();
			System.out.println("After t1.close()...");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		/* //////////////////////////////////////////
		// Try with resources 
		try(Temp t2 = new Temp()) {
			
			System.out.println("In try block...");
			// End of this block will automatically call .close()...

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After try block...");
		*/
		
		/////////////////////////////////////////////
		File file = new File("test.txt");
		
		//FileReader fr = new FileReader(file);
		//BufferedReader br = new BufferedReader(fr);
		
		//BufferedReader br = new BufferedReader(new FileReader(file));
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			while( (line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not found " + file.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Unable to read file " + file.toString());
		};
		
	}
}
