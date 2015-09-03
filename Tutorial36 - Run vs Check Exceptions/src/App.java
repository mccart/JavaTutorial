
public class App {

	public static void main(String[] args) {

		try {
			Thread.sleep(11);
		} catch (InterruptedException e) {	// checked exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//int value = 7;
		//value /= 0;		// unchecked exception - /0
		
		// unchecked = runtime...
		
		//String text = null;
		//System.out.println(text.length());	// runtime exception - null ptr
		
		String[] texts = {"1", "2", "3", "4" };
		
		try {
			System.out.println(texts[5]); 	// runtime out of bounds exception
		} 
		//catch(Exception e) {
		//catch(RuntimeException e) {
		catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());	// 3 - not useful
			System.out.println(e.toString());	// IndexOutOfBounds... 5
			//e.printStackTrace();  -  default...
		}
	}

}
