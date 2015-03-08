import world.Plant;

/*
 * private --- only within same class
 * public --- from anywhere
 * protected --- subclass and same package
 * no modifier --- same package only
 * 
 * you can always access from the same class
 * classes can't be private, but they can be without public (or any other) prefix
 */

public class PublicPrivateProtected {

	public static void main(String[] args) {

		Plant plant = new Plant();
		
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		// size is protected; this .java file is not in sama packages as Plant
		// Won't work
		//System.out.println(plant.size);
		
		
		// Won't work; this .java file is in different package as Plant, height has package level visibility
		//System.out.println(plant.height);
		
		
	
	}

}
