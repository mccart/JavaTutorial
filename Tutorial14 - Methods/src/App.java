
class Person {
	
	String name;
	int age;
	int heartRate;
	
	void speak() {
		System.out.println("My name is " + name + " and I am " + age +" years old");
		this.sayHello();
	}
	
	void sayHello() {
		System.out.println("Hello there!");
	}
}


public class App {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Michael McCartney";
		p1.age = 56;
		p1.speak();
		
		Person p2 = new Person();
		p2.name = "Connie McCartney";
		p2.age = 56;
		p2.speak();
		
	}
}
