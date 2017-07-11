package Beispiele;

public class CastError {

	public static void main(String[] args) {
		Person2 p = new Person2("Strindberg","Skandinavien");
		Student s = (Student)p;
		System.out.print(s.matrikelNummer);

	}

}
