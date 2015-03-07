class Person {
	String name;
	int age;

	void speak() {
			System.out.println("My name is " + name);
	}
	int yearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
}

public class GetAndReturnValues {

	public static void main(String[] args) {
		Person pets = new Person();
		pets.name = "Peeter";
		pets.age = 29;

		pets.speak();
		int years = pets.yearsToRetirement();
		System.out.println("Years till retirement: " + years);
		
		int age = pets.getAge();
		String name = pets.getName();
		System.out.println(age);
		System.out.println(name);
		

	}

}
