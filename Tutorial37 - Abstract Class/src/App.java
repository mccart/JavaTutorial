
public class App {

	public static void main(String[] args) {
		
		Camera cam1 = new Camera();
		cam1.setId(4);
		//cam1.start();	// Starting camera 4
		cam1.run();		// Starting camera 4
		
		Car car1 = new Car();
		car1.setId(5);
		//car1.start();	// Starting car 5
		car1.run();		// Starting car 5
	}

}
