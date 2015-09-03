
public class Robot {
	
	private int id;
	
	// nested or inner class
	//
	//public class Brain {
	private class Brain {
		public void think() {
			System.out.printf("Robot %d is thinking.\n", id);
		}
	}
	
	// static inner class
	//
	static class Battery {
		public void charge() {
			System.out.println("Battery charging...");
		}
	}

	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.printf("Starting robot %d\n", id);
		// typical use of inner class
		Brain b = new Brain();
		b.think();
		
		String name = "Robert";
		
		class Temp {
			public void doSomething() {
				System.out.println("ID is : " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp t = new Temp();
		t.doSomething();
		
	}
	
}
