package Beispiele;
public class TestLateBinding {
	public static void main(String[] args) {
		Student s = new Student("Martin Müller","Hauptstraße", 756456);
		Person2 p1 = new Person2("Harald Schmidt","Marktplatz");
		
		System.out.println(s.toString());
		System.out.println(p1.toString());
		
		Person2 p2 = new Student("Martin Müller","Hauptstraße",756456);
		System.out.println(p2.toString());
	}
}
