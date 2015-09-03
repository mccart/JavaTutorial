import java.util.ArrayList;

class Machine {
	
	protected int id;

	public Machine(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.printf("Machine %d starting.\n", id);
	}
	
	@Override
	public String toString() {
		return String.format("Machine %d", id);
	}
	
}

class Camera extends Machine {
	
	public Camera(int id) {
		super(id);
	}

	public void snap() {
		System.out.printf("Camera %d took a photo.\n", id);
	}
	
	@Override
	public String toString() {		
		return String.format("Camera %d", id);
	}
	
}

public class App {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		
		showList(list);

		ArrayList<Machine> l1 = new ArrayList<>();
		
		l1.add(new Machine(1));
		l1.add(new Machine(2));
		
		showList(l1);
		showList1(l1);
		showList2(l1);

		ArrayList<Camera> l2 = new ArrayList<>();
		
		l2.add(new Camera(1));
		l2.add(new Camera(2));
		
		showList(l2);
		showList1(l2);
		showList2(l2);
	}
	
	public static void showList(ArrayList<?> list) {
		
		for(Object value: list){
			System.out.println(value);
		}
		System.out.println();
	}
	
	// upper bound...
	public static void showList1(ArrayList<? extends Machine> list) {
		
		for(Machine value: list){
			System.out.println(value);
			value.start();	// Machine method
		}
		System.out.println();
	}	
	
	// lower bound...
	public static void showList2(ArrayList<? super Camera> list) {
		
		for(Object value: list){
			System.out.println(value);
		}
		System.out.println();
	}

}
