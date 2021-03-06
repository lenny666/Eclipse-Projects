class Thing { //paljud asjad peaks private olema mitte public.... 
	public final static int LUCKY_NUMBER = 7; // final = constant... e. ei ole v�imalik muuta
	public String name; //igal objektil mis sellest klassist tehtud, on muutujal nimi eraldi v��rtus
	public static String description; // static t�hendab seda, et muutuja v��rtus k�ib terve klassi kohta (igal klassi objektil ei ole eraldi v��rtust)

	
	public static int count = 0; // teen staatilise muutuja count (mis on k�igil klassi objektidel �hine)
	
	public int id;
	
	public Thing() { // selle meetodiga iga kord kui uus klassi objekt luuakse, suurendame count-i v��rtust �he v�rra
		
		id = count; // selle abil lisame igale objektile unikaalse id
		count++;
	}
	
	public void showName() {
		System.out.println("Object id: " + id + ", " + description + ": " + name);
	}
	
	public static void showInfo() { 
		System.out.println(description);
		
		// won't work with static methods: System.out.println(name); (sest name ei ole staatiline muutuja).
	}
}

public class StaticKeywords {

	public static void main(String[] args) {

		Thing.description = "I am a thing"; // loome klassile staatilise v��rtuse
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		System.out.println("After creating objects, count is: " + Thing.count);
		
		//System.out.println(thing1.name);
		//System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		//System.out.println(Thing.description); // prindime klassi (staatilise) v��rtuse v�lja
		Thing.showInfo(); //sama mis �lemine rida
		
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER); // static, ehk muutumatud v��rtused on tavaliselt suurte t�htedega kirjut. (nagu PI eelmisel real)
	}

}
