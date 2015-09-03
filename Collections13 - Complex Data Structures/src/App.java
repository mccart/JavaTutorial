import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static String[] vehicles = { 
			"ambulance", "helicopter", "lifeboat" 
	};

	public static String[][] drivers = { 
			{ "Fred", "Sue", "Pete" }, 
			{ "Sue", "Richard", "Bob", "Fred" },
			{ "Pete", "Mary", "Bob" }, 
	};

	public static void main(String[] args) {

		// Java 7
		// Map<String, Set<String>> p1 = new HashMap<>();
		// Java 6
		Map<String, Set<String>> p1 = new HashMap<String, Set<String>>();

		for (int i = 0; i < vehicles.length; i++) {
			String v = vehicles[i];
			String[] dl = drivers[i];

			Set<String> ds = new LinkedHashSet<String>();
			for (String d : dl) {
				ds.add(d);
			}

			p1.put(v, ds);

			System.out.println(v + ": " + ds);
		}
		/* ambulance: [Fred, Sue, Pete]
		 * helicopter: [Sue, Richard, Bob, Fred]
		 * lifeboat: [Pete, Mary, Bob]
		 */

		{	// Example 1
			Set<String> dl = p1.get("helicopter");
			
			System.out.println(dl);		// [Sue, Richard, Bob, Fred]
			for (String d : dl) {
				System.out.println(d);
			}
		}

		// Example 2
		for (String v : p1.keySet()) {
			System.out.printf("%s:", v);
			
			Set<String> dl = p1.get(v);
			for (String d : dl) {
				System.out.printf(" %s",d);
			}
			System.out.println();
		}
		/* helicopter: Sue Richard Bob Fred
		 * lifeboat: Pete Mary Bob
		 * ambulance: Fred Sue Pete
		 */
	}

}
