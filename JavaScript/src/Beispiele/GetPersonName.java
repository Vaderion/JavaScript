package Beispiele;
public class GetPersonName {

	public static void main(String[] args) {
		Person1 p = new Person1("August", "Strindberg");
		
		String name = p.vorname;
		System.out.println(name);
	}

}
