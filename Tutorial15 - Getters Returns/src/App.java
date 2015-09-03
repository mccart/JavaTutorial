
class Person {
	
	String name;
	int age;
	int heartRate;
	
	void speak() {
		System.out.println("My name is " + name + " and I am " + age +" years old");
		//sayHello();
		int years = calculateYearsToRetirement();
		System.out.println("I have " + years + " till retirement");
	}
	
	void sayHello() {
		System.out.println("Hello there!");
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 67 - age;
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}


public class App {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Michael McCartney";
		p1.age = 56;
		p1.speak();
		
		int age = p1.getAge();
		String name = p1.getName();
		
		System.out.println("Name: " + name + " Age: " + age);
		
		}
}
