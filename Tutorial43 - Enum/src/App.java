
public class App {

	/*
	public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int MOUSE = 2;
	 */
	
	public static void main(String[] args) {

		//int ani = CAT;
		Animal ani = Animal.DOG;

		switch (ani) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			// should never get here unless case missing
			System.out.println("Unknown animal " + ani);
			break;

		}
		
		System.out.println(Animal.DOG);
		System.out.println(Animal.DOG.name());
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG instanceof Enum);
		
		System.out.println(Animal.MOUSE.getName());
		
		Animal a2 = Animal.valueOf("CAT");
		System.out.println(a2);
				
	}

}
