
class Person {
	String name;
	int age;
}


public class App {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Michael McCartney";
		p1.age = 56;
		
		Person p2 = new Person();
		p2.name = "Connie McCartney";
		p2.age = 56;
		
		System.out.println(p1.name);
		
	}
}
