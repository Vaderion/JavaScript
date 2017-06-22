package Beispiele;
public class Student extends Person2 {
	int matrikelNummer;
	
	String writeAllFields(Student s) {
		return s.name+" "+s.address+" "+s.matrikelNummer;
	}
	
	int getMatrikelNummer() {
		return matrikelNummer;
	}
}
