package code;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person() {
		this.firstName = "";
		this.lastName = "";
	}
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public static void toInitials(Person p) {
		p.setFirstName(p.getFirstName().substring(0, 1));
		p.setLastName(p.getLastName().substring(0, 1));
	}
	
	@Override
	public String toString() {
		return "Hi my name is " + this.firstName + " " + this.lastName + ". Nice to meet you!";
	}
	
	public static void main(String[] args) {
		//demo of object references
		Person doe = new Person("Jane", "Doe");
		Person anotherDoe = new Person("Jane", "Doe");
		System.out.println(doe == anotherDoe);
		System.out.println(doe);
		System.out.println(anotherDoe);
		System.out.println();
		anotherDoe = doe;
		System.out.println(doe == anotherDoe);
		System.out.println(doe);
		System.out.println(anotherDoe);
		System.out.println();
		
		toInitials(doe);
		System.out.println(doe);
		System.out.println(anotherDoe);
		
	}
}
