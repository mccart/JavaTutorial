import java.util.ArrayList;
import java.util.HashMap;

// array list generic


public class App {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = list.get(1);
		System.out.println(fruit);
		
		// more than one type of arg
		
		//HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		HashMap<Integer, String> map = new HashMap<>();
		
	}

}
