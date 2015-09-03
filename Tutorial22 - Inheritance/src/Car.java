
public class Car extends Machine {
	
	//public void start() {
	//	System.out.println("Car started...");
	//}
	
	public void wipeWindShield() {
		System.out.println("Wiping windshield.");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		//super.start();	
		System.out.println("Car started...");

	}
	
	public void showInfo() {
		System.out.println("Car: " + name);
	}

}
