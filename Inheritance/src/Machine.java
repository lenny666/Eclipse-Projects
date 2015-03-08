
public class Machine {
	
	protected String name = "Machine Type 1"; // acces it from anywhere in the package... or child classes
	
	public void start() {
		System.out.println("Machine started!");
	}
	
	public void stop() {
		System.out.println("Machine stopped!");
	}

}
