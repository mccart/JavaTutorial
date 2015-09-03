
public class App {
	public static void main(String[] args) {

		Plant p1 = new Plant();	// parent class
		Tree tree = new Tree();	// child class
				
		// Plant p2 = p1;  // ref same object...
		
		Plant p2 = tree;	// polymorphism
		
		p2.grow();	// Tree growing
		
		tree.shedLeaves();
		
		//p2.shedLeaves();	// error
		
		doGrow(tree);	// Tree growing
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
	
	
}
