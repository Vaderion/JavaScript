package Aufgaben;
public class Ausleihe {
	Person Person;
	Buch Buch;
	Datum Datum;
	
	Ausleihe(Person p, Buch b, Datum d) {
		Person = p;
		Buch = b;
		Datum = d;
	}
	
	public String toString() {
		return ("\n"+
				"Ausleihe: "+"\n"+
				Person+"\n"+
				Buch+"\n"+
				Datum+"\n");
	}
}
