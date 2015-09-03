
public class App {

	public static void main(String[] args) {

		Robot r1 = new Robot(1);
		r1.start();
		
		// this works if inner Brain class is public in Robot class
		//Robot.Brain b = r1.new Brain();
		//b.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}

}

// Anonymous class sort of inner class
//
// three cases of inner classes
// 1. nested or inner class
// 2. static inner class
// 3. method or local class
//