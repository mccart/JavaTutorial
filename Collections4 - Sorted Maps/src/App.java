import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//class Temp {
//}

public class App {

	public static void main(String[] args) {
		
		//System.out.println(new Temp());	// Temp@139a55
		
		// unsorted
		//HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// sorted in order inserted
		//LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		// key sorted in natural order
		//TreeMap<Integer, String> treeMapMap = new TreeMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		//testMap(hashMap);
		//testMap(linkedHashMap);
		testMap(treeMap);
		
	}
	
	// Three possible interfaces: List, Set, and Map
	
	public static void testMap(Map<Integer, String> map) {
		
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		map.put(7, "bob");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
			
	}
}
