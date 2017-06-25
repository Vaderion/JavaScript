package Beispiele;
public class ButtonLogic2 extends ButtonLogic{
	String getDescription() {
		return "In Kleinbuchstaben umwandeln";
	}
	String eval(String x) {return x.toLowerCase();}
}
