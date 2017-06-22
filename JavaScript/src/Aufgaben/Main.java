package Aufgaben;
public class Main {

	public static void main(String[] args) {
		Person p = new Person("Vorname", "Nachname", "Straﬂe", 12345, "Ort");
		System.out.println(p);

		Buch b = new Buch("Titel", "Autor");
		System.out.println(b);
		
		Datum d = new Datum(21, 06, 2017);
		System.out.println(d);
	
		Ausleihe a = new Ausleihe(p, b, d);
		System.out.println(a);

		Person.letzterVorname();
	}

}
