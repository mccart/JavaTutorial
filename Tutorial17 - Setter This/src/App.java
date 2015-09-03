
class Frog {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

public class App {
	public static void main(String[] args) {
		
		Frog f1 = new Frog();
		
		//f1.name = "Bertie";
		//f1.age = 1;
		
		f1.setName("Bertie");
		f1.setAge(1);
		
		System.out.println(f1.getName());
			

	}
}
