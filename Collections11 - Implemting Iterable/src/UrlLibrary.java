import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {

	private LinkedList<String> urls = new LinkedList<String>();
	
	// inner class just to access urls list
	// alternatively new class and pass urls to constructor
	private class UrlIterator implements Iterator<String> {
		
		private int index = 0;	// defaults 0 anyway

		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {
			
			StringBuilder sb = new StringBuilder();
			
			try {
				System.out.println(urls.get(index));
				URL url = new URL(urls.get(index));
				
				System.setProperty("http.proxyHost", "global.proxy.lucent.com");
				System.setProperty("http.proxyPort", "8000");
				
				BufferedReader br = new BufferedReader( 
						new InputStreamReader(
						url.openStream()
						));
				
				String line = null;
				
				while( (line = br.readLine()) != null ) {
					sb.append(line);	// strips new line..
					sb.append("\n");
				}
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			index++;
			
			return sb.toString();
		}

		@Override
		public void remove() {
			urls.remove(index);
		}
		
	}

	public UrlLibrary() {
		urls.add("http://www.caveofprogramming.com");
		//urls.add("http://www.facebook.com/caveofprogramming");
		urls.add("http://news.bbc.co.uk");
		urls.add("http://all.alcatel-lucent.com");
	}

	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
		//return urls.iterator();
		//return null;
	}
	
}
