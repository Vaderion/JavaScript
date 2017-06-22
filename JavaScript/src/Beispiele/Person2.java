package Beispiele;
public class Person2 {
	String name;
	String address;
	
	Person2(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String toString() {
		return name+", "+address;
	}
}
