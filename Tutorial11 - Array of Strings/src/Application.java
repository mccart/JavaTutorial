public class Application {
	public static void main(String[] args) {
		
		String[] words = new String[3];
		
		String[] fruits = {"apple", "banana", "pear", "kiwi" };
		
		for( String fruit: fruits) {
			System.out.println(fruit);
		}
		
		String text = null;
		System.out.println(text);

		String[] texts = new String[2];
		System.out.println(texts[0]);
		
		texts[0] = "zero";
		System.out.println(texts[0]);
	}
}
