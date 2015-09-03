
public class App {
	public static void main(String[] args) {
		
		String info = "";
		
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Roger.").append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		// StringBuffer - same but thread safe
		
		// formatting
		// .print()
		// .println()
		// .printf() ... %d %-2d %f %.2f %5.1f  %6.1f %-6.1f

		for( int i=5; i<16; i++) {
			System.out.printf("Value: %d.\n", i);
		}
		for( int i=5; i<16; i++) {
			System.out.printf("Value: %2d.\n", i);
		}
		for( int i=5; i<16; i++) {
			System.out.printf("Value: %-2d.\n", i);
		}
		
		System.out.printf("Value: %f\n", 5.6874);
		System.out.printf("Value: %.2f\n", 5.6874);
		
		System.out.printf("Value: %.1f\n", 343.23423);
		System.out.printf("Value: %5.1f\n", 343.23423);
		System.out.printf("Value: %6.1f\n", 343.23423);
		System.out.printf("Value: %-6.1f\n", 343.23423);
		
	}
}
