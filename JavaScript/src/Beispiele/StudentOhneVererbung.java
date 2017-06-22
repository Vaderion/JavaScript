package Beispiele;
public class StudentOhneVererbung {
	String name;
	String address;
	int matrikelNummer;
	
	StudentOhneVererbung(String name, String address, int nr) {
		this.name = name;
		this.address = address;
		matrikelNummer = nr;
	}
	
	public String toString() {
		return name+", "+address+" Matrikel.Nr.: "+matrikelNummer;
	}
}
