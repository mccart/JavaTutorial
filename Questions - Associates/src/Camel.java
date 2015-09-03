
// when fixed outputs 27 mph, lope

interface Rideable {
	String getGait();
}

public class Camel implements Rideable {
	int weight = 2;

	public static void main(String[] args) {
		new Camel().go(8);
	}

	void go(int speed) {
		++speed;
		weight++;
		int walkrate = speed * weight;
		System.out.print(walkrate + getGait());
	}

	//String getGait() {		// error
	// cant reduce visiblity of inherited Rideable.getGait
	public String getGait() {	// fixed
		return " mph, lope";
	}
}