package Aufgaben;
public class Buch {
	String titel;
	String autor;
	
	Buch(String thisTitel, String thisAutor) {
		titel = thisTitel;
		autor = thisAutor;
	}
	
	public String toString() {
		return ("Titel: "+titel+", Autor: "+autor);
	}
}
