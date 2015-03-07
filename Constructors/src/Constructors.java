class Machine {
	private String name;
	private int code;
	
	public Machine() {
		System.out.println("Constructor activated!");
		name = "Arnie"; //selle asemel võid ka teise meetodi siit meetodist kutsuda
		// this("Arnie", 0 ); //see peaks olema siis konstruktori esimene rida
	}
	
	public Machine(String name) {
		System.out.println("Second constructor activated!");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		this.name = name;
		this.code = code;
		System.out.println("Third constructor activated!");
	}
}

public class Constructors {

	public static void main(String[] args) {
		
	Machine machine1 = new Machine();
	Machine machine2 = new Machine("Bertie");
	Machine machine3 = new Machine("Peter", 16);
	
	}

}
