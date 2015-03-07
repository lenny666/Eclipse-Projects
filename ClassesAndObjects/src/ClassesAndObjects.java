class Person {
	// Instance variables (data or "state")
	String name;
	int age;
	
	
	
	
	
	
	// Classes can contain
	// 1. Data
	// 2. Subroutines (a.k.a methods)
}


public class ClassesAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		
		person1.name = "Joe Bloggs";
		person1.age = 38;
		
		Person person2 = new Person();
		person2.name = "Jane Doe";
		person2.age = 25;
		
		System.out.println(person1.name);
		
	}

}
