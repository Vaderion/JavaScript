
public class MergeSort {

	public static void main(String[] args) {
		int[] test = {5,4,6,2,1,10,7,3,8,9};
		int[] test2 = sort(test);		
		for(int i=0; i<test.length; i++) {
			System.out.print(test[i]+" ");
		}
		System.out.println();
		for(int i=0; i<test2.length; i++) {
			System.out.print(test2[i]+" ");
		}
	}
	
	
	public static int[] sort(int[] array) {
		if (array.length > 1) {
			int mitte = array.length / 2;									//Mitte des unsortierten Arrays wird bestimmt(Bei ungerader Länge wird abgerundet)

			int[] links = new int[mitte];									//Das Array "links" bekommt die Länge "mitte"
			for (int i = 0; i <= links.length - 1; i++) {					//Das Array "links" wird mit den Werten von "array" gefüllt
				links[i] = array[i];
			}

			int[] rechts = new int[array.length - mitte];					//Das Array "rechts" bekommt die Länge "array.length - mitte", also die Länge der übrigen Seite
			for (int i = mitte; i <= array.length - 1; i++) {				//Das Array "rechts" wird mit den Werten von "array" gefüllt, die nicht bei "links" verwendet wurden
				rechts[i - mitte] = array[i];
			}

			links = sort(links);											//Rekursion("links" wird jetzt wieder als "array" verwendet und in zwei Teile geteilt...)
			rechts = sort(rechts);											//Rekursion("rechts" wird jetzt wieder als "array" verwendet und in zwei Teile geteilt...)

			return merge(links, rechts);									//
		}
		else
		{
			return array;													//Wenn das zu sortierende Array nur eine Stelle hat, ist es schon sortiert und wird direkt ausgegeben
		}
	}

	private static int[] merge(int[] links, int[] rechts)
	{
		int[] neuesArray = new int[links.length + rechts.length];			//Das Array "neueArray" erhält die Länge "links.length + rechts.length", also die Gesamtlänge beider Arrays
		int indexLinks = 0;
		int indexRechts = 0;
		int indexErgebnis = 0;
		
		while (indexLinks < links.length && indexRechts < rechts.length) {	//Solange die Indizes die Länge der Arrays nicht überschreiten wird die Schleife ausgeführt
			if (links[indexLinks] < rechts[indexRechts]) {					//Wenn die Zahl an der Stelle i links kleiner ist als rechts=>
				neuesArray[indexErgebnis] = links[indexLinks];				//=> wird die Zahl in "neuesArray" an der Stelle i eingefügt und=>
				indexLinks ++;												//indexLinks wird inkrementiert
			} else {
				neuesArray[indexErgebnis] = rechts[indexRechts];			//Sonst wird die Zahl aus der echten Liste an der Stelle i bei "neues Array" an der Stelle i eingefügt
				indexRechts ++;												//indexRechts wird inkrementiert
			}
			indexErgebnis ++;												//indexErgebnis wird inkrementiert
		}
		
		while (indexLinks < links.length) {									//Solange "indexLinks" die Länge der linken Liste nicht überschreitet, wird die Schleife ausgeführt
			neuesArray[indexErgebnis] = links[indexLinks];					//An der Stelle i wird der Wert von "links" nach "neues Array" eingefügt
			indexLinks ++;
			indexErgebnis ++;
		}
		
		while (indexRechts < rechts.length) {
			neuesArray[indexErgebnis] = rechts[indexRechts];
			indexRechts ++;
			indexErgebnis ++;
		}
		
		return neuesArray;
	}
}
