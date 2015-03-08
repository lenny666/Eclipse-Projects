
public class Polymorphism {

	public static void main(String[] args) {

		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree; 
		
		plant2.grow(); // since the actual object is Tree object, .grow() method is run from Tree class
		
		tree.shedLeaves();
		
		
		//plant2.shedLeaves(); --- won't work because Plant type doesn't have .shedLeaves method (even though the object inside it is tree)
		
		/*
		 * The type of variable decides what methods you are allowed to call,
		 * but the actual object that contains the methods are actually run.
		 * 
		 * Thus plant2.grow(); can be run, because that method is present in Plant class,
		 * even though the method that is run is located in Tree class (since Tree is Plant's
		 * subclass and has Override for .grow()
		 * 
		 * That is also the reason why plant2.shedLeaves won't work... there is no 
		 * method by that name in Plant class (it would work if you would put empty 
		 * .shedLeaves(); method in Plant and used Override in Tree.
		 */
		
		
		
		
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
