
public class StringBuilderAndFormatting {

	public static void main(String[] args) {
		// Inefficient.
		String info = "";
		
		info += "My name is Bob";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		
		StringBuilder sb = new StringBuilder("");
		
		// More efficient.
		sb.append("My name is Sue");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name is Roger")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		
		// Formatting //////////////////////////////////////
		
		System.out.print("Here is some text.\tThat was a tab.\nThat was a newline");
		System.out.println(" More text.");
		
		// Fromatting integers
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
		
		for(int i=0; i<20; i++) {
			System.out.printf("%2d: %s\n", i, "Here's some text."); // %2d - kahe kohaline ruum numbri jaoks
		}
		 // Formatting text
		System.out.printf("Total value: %.2f\n", 5.6789); // %.2f - kaks komakohta (olenemata sellest, mitu komakohta on)
		System.out.printf("Total value: %-6.1f\n", 343.23456); // %-6.1f .... -6 teeb 6 kohalise pesa vasakjoondusega
	}

}
