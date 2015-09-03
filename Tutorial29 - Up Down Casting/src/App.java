class Machine {

	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine {

	public void start() {
		System.out.println("Camera started.");
	}

	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class App {

	public static void main(String[] args) {

		Machine m1 = new Machine();
		Camera c1 = new Camera();
		
		m1.start();
		c1.start();
		c1.snap();
		
		// Upcasting
		//Machine m2 = new Camera();
		Machine m2 = c1;
		m2.start();
		//m2.snap(); -  undefined for Machine
		
		// Downcasting
		Machine m3 = new Camera();
		Camera c2 = (Camera) m3;
		c2.start();
		c2.snap();
		
		// Doesn't work --- runtime error
		Machine m4 = new Machine();
		//Camera c3 = (Camera) m4;
		//c3.start();
		//c3.snap();
		
		
	}

}
