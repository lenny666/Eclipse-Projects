import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Ouptut prompt
		System.out.println("Enter an integer: ");
		
		// Wait for user to enter something
		double value = input.nextDouble();
		
		// Tell them what they entered
		System.out.println("You entered: " + value);
		input.close();
		

	}

}
