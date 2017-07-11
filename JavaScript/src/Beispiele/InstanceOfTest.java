package Beispiele;

public class InstanceOfTest {

	public static void main(String[] args) {
		Person2 p1 = new Person2("Strindberg","Skandinavien");
		Person2 p2 = new Student("Ibsen","Skandinavien",789565);
		if (p1 instanceof Student)
			System.out.println("p1 ist ein Student.");
		if (p2 instanceof Student)
			System.out.println("p2 ist ein Sudent");
		if (p1 instanceof Person2)
			System.out.println("p1 ist eine Person");
		if (p2 instanceof Person2)
			System.out.println("p2 ist eine Person");
	}

}
