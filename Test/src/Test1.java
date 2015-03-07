class Person {
	private String name;
	private Brain brain;
	
	public Person() {
	}
	
	public Person(String name) {
		this.name = name;
		brain = new Brain();
	}
	
	public void writeName(){
		System.out.println("My name is " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

class Brain {
	public Brain() {
		System.out.println("Thinking...");
		
	}
}

public class Test1 {

	public static void main(String[] args) {

		System.out.println("Hello World");
		Person person1 = new Person("John");
		
		String name = person1.getName();
		name = name + " Smith";
		
		person1.setName(name);
		
		person1.writeName();
	}

}
