import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {

		// Switch is not used by many developers

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
		case "start": // "start" can't be variable... has to be constant
			System.out.println("Machine started!");
			break;

		case "stop":
			System.out.println("Machine stopped!");
			break;

		default:
			System.out.println("Command not reconginzed");
			input.close();
		}
	}
}
