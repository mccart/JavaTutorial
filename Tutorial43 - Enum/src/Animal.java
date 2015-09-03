
public enum Animal {
	//DOG, CAT, MOUSE  // plain enum list
	
	DOG("Fido"), CAT("Fergus"), MOUSE("Jerry");
	
	private String name;
	
	// constructor, cant do public - cant do "new"
	Animal(String name) {
		this.name = name;
	}
	
	// methods
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "This animal is called " + name;
	}
	
}
