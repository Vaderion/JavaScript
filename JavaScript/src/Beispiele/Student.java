package Beispiele;
public class Student extends Person2 {
	int matrikelNummer;
	
	String writeAllFields(Student s) {
		return s.name+" "+s.address+" "+s.matrikelNummer;
	}
	
	int getMatrikelNummer() {
		return matrikelNummer;
	}
	
	public String toString() {
		return super.toString() + " Matrikel.Nr.: "+matrikelNummer;
	}
	
	Student(String name, String adresse, int nr) {
		super(name, adresse);
		matrikelNummer = nr;
	}
}
