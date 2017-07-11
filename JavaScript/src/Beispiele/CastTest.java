package Beispiele;

public class CastTest {

	public static void main(String[] args) {
		Person2 p = new Student("Ibsen","Skandinavien",789565);
		
		if (p instanceof Student) {
			Student s = (Student)p;
			System.out.println(s.matrikelNummer);
		}
	}
}
