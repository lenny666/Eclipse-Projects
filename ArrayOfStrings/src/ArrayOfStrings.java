
public class ArrayOfStrings {

	public static void main(String[] args) {
		
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}	
		int value = 123; //enough memory to (only) hold an integer
		
		String text = null; //String is not a primitive like int (suur algust�ht). null on default v��rtus Stringile
		
		System.out.println(text);
		
		String[] texts = new String[2];
		
		System.out.println(texts[0]);
		
		texts[0] = "one";
	}

}
