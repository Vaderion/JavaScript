package Aufgaben;
public class Person {
	String name;
	String vorname;
	String stra�e;
	String ort;
	int plz;
	static String letzterVorname;
	
	Person(String thisVorname, String thisName, String thisStra�e, int thisPlz, String thisOrt) {
		vorname = thisVorname;
		name = thisName;
		stra�e = thisStra�e;
		ort = thisOrt;
		plz = thisPlz;
		letzterVorname = vorname;
	}

	public String toString() {
		return (vorname+" "+name+", Adresse: "+stra�e+", "+plz+" "+ort);
	}

	static void letzterVorname() {
		System.out.print(letzterVorname);
	}
}
