
public class Car extends Machine {
	
	
	
	@Override // kontrollib, et sa ikka kirjutad parrent klassi meetodi �le (mitte ei loo uut meetodit, kui sa meetodi nime valesti kirjutad)
	public void start() {
		System.out.println("Car started");
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name); // ei t��ta kui name on private
	}

}
