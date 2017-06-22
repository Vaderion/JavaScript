package Beispiele;
public class CallFullNameMethod {

	public static void main(String[] args) {
		Person1 p = new Person1("August", "Strindberg");
		
		String name = p.getFullName();
		System.out.println(name);
	}

}
