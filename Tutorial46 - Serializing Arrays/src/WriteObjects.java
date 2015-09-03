import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");

		Person[] pe = { new Person(56, "Mike"), new Person(56, "Connie"), new Person(18, "Julia"),
				new Person(13, "Sarah"), new Person(7, "Grace"), };

		for (Person i : pe) {
			System.out.println(i);
		}

		ArrayList<Person> pl = new ArrayList<Person>(Arrays.asList((pe)));

		for (Person i : pl) {
			System.out.println(i);
		}
		
		// try(FileOutputStream fs = new FileOutputStream("people.bin")) {
		// ObjectOutputStream os = new ObjectOutputStream(fs);

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

			os.writeObject(pe);
			os.writeObject(pl);
			
			os.writeInt(pl.size());
			for(Person i: pl) {
				os.writeObject(i);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
