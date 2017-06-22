package Aufgaben;
public class Person {
	String name;
	String vorname;
	String straﬂe;
	String ort;
	int plz;
	static String letzterVorname;
	
	Person(String thisVorname, String thisName, String thisStraﬂe, int thisPlz, String thisOrt) {
		vorname = thisVorname;
		name = thisName;
		straﬂe = thisStraﬂe;
		ort = thisOrt;
		plz = thisPlz;
		letzterVorname = vorname;
	}

	public String toString() {
		return (vorname+" "+name+", Adresse: "+straﬂe+", "+plz+" "+ort);
	}

	static void letzterVorname() {
		System.out.print(letzterVorname);
	}
}
