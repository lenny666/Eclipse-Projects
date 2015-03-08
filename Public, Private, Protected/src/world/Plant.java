package world;
public class Plant {
	
	// Bad practice
	public String name; // public can be accessed from anywhere
	
	// Acceptable practice --- since it's final
	public final static int ID = 8; // final means it can't be changed
	
	private String type;  // can be accessed only within this class
	
	protected String size; // can be accessed within this class and subclasses (like Oak for example)
	
	int height;
	
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		this.size = "medium";
		this.height = 9;
		
	}
}
