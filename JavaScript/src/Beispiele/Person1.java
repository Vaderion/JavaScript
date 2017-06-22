package Beispiele;
public class Person1 {
	String vorname;
	String nachname;
	
	Person1(String derVorname, String derNachname) {
		vorname = derVorname;
		nachname = derNachname;
		}
	String getFullName() {
		return (vorname+" "+nachname);
	}
}
