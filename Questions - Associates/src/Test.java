
// compile error

class A {
	public A(int x) {
	}
}

class B extends A {

	// add missing constructor
	public B(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
}

public class Test {
	public static void main(String args[]) {
		//A a = new B();	// compiler error
		A a = new B(0);
		System.out.println("complete");
	}
}
