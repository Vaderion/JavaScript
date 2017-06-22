package Beispiele;
public class TestStudent2 {
	static void printPerson(Person2 p) {
		System.out.println(p.toString());
	}
	
	public static void main(String[] args) {
		Student s = new Student("Martin Müller","Hauptstraße",754545);
		printPerson (s);
	}
}
