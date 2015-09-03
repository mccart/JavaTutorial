import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		//try(FileOutputStream fs = new FileOutputStream("people.bin")) {
			//ObjectOutputStream os = new ObjectOutputStream(fs);
			
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
				
			Person p1 = new Person( 7, "Bob" );
			System.out.println(p1);
			os.writeObject(p1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
