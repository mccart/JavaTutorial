
class Class1 {
	String v1;
}

class Class2 {
	Class1 c1;  // c1.v1
	String v2;
}

public class Class3 {
	Class2 c1;  // c1.c1.v1 and c1.v2)
	String i3;
}

// C) Class2 has-a v2
// D) Class3 has-a v1 
// F) Class2 has-a Class1 