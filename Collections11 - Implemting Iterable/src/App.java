
public class App {

	public static void main(String[] args) {
		
		UrlLibrary urlLib = new UrlLibrary();
		
		// string
		//for( String url: urlLib ) {
		//	System.out.println(url);
		//}
		
		// html with new implements Iterable
		for( String html: urlLib ) {
			System.out.println(html.length());
			//System.out.println(html);
		}		
	}

}
