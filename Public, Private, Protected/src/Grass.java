import world.Plant;

public class Grass extends Plant {

	public Grass() {
		// This won't work --- Grass in not same package as Plant, even though it's a subclass
		//System.out.println(this.height);
	}
}
