class Plant {
	
	public static final int ID = 7; // This can't be changed, so it can be public
	private String name; // This is accessible only via getName() and setName methods.
	
	public String getData() {
		String data = "some stuff " + calculateGrowthForecast();
		return data;
	}

	private int calculateGrowthForecast() { // Prevents ppl from calling this method from outside
		return 9;
	}
	
	public String getName() { 
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


public class EncapsulationAndAPIDocs {

	public static void main(String[] args) {

		
	}

}
