package Aufgaben;
public class Datum {
	int tag;
	int monat;
	int jahr;
	
	Datum(int thisTag, int thisMonat, int thisJahr) {
		tag = thisTag;
		monat = thisMonat;
		jahr = thisJahr;
	}
	
	public String toString() {
		return ("Datum: "+tag+"."+monat+"."+jahr);
	}
	
}
