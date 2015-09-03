class Machine {
	
	protected int id;
	
	public Machine(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.printf("Starting machine %d\n", id);
	}
	
}

interface Plant {
	public void grow();
}


public class App {

	public static void main(String[] args) {

		//Machine m1 = new Machine(1);
		//m1.start();		// Starting machine 1

		// Anonymous class...
		Machine m1 = new Machine(2) {
			@Override
			public void start() {
				System.out.printf("Camera %d snapping...\n",id);
			}
		};
		
		m1.start();		// Camera 2 snapping...
		
		//Plant p1 = new Plant();  not legal
		
		// Anonymous class syntax...
		Plant p1 = new Plant() {
			@Override
			public void grow() {
				System.out.println("Plant growing");
			}
		};  

		p1.grow();
	}

}
