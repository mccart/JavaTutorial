import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");
		
		map.put(6, "Hello");	// overwrites Four with Hello
		
		String text = map.get(4);
		System.out.println(text);	// Four
		
		System.out.println(map.get(1));	// null
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
		
	}
}
