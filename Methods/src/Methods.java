class Person {
	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contain
	// 1. Data
	// 2. Subroutines (a.k.a methods)

	void speak() {
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is " + name + " and i'm " + age
					+ " years old.");
		}
	}
	void sayHello() {
		System.out.println("Hello there");
	}
}

public class Methods {

	public static void main(String[] args) {
		// Create a Person object using Person class
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 38;
		person1.speak();
		person1.sayHello();
	

		// Create a second Person object
		Person person2 = new Person();
		person2.name = "Jane Doe";
		person2.age = 25;
		person2.speak();
		person2.sayHello();

		System.out.println(person1.name);

	}

}
