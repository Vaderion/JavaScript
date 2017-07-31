package Beispiele;

public class Testbool {
	boolean boolFeld;
	
	Testbool(boolean b){
		boolFeld = b;
	}
	
	boolean getBoolFeld(){
		return this.boolFeld;
	}
	
	public static void main(String [] args){
		Testbool t = new Testbool(true);
		System.out.println(t.getBoolFeld());
		t = new Testbool(false);
		System.out.println(t.getBoolFeld());
	}

}
