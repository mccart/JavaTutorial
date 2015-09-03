
public class Machine implements Info {

	private int id = 7;
	
	public void start() {
		System.out.println("Starting...");
	}

	@Override
	public void showInfo() {
		System.out.println("Id: " + id);		
	}
}
