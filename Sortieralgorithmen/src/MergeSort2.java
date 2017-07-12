
public class MergeSort2 {

	public static void main(String[] args) {
		int[] array = {5,4,6,2,1,10,7,3,8,9};
		int[] array2 = sort(array);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(int i=0; i<array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
	}
	
	
	public static int[] mergeSort(int[] unsorted) {
	if(unsorted.length == 1) {
		return unsorted;
	}
	int[] l = new int[(int) Math.floor(unsorted.length/2)];				//Länge der linken Liste ist Länge der unsortierten Liste/2 abgerundet
	int[] r = new int[(int) Math.ceil(unsorted.length/2)];				//Länge der rechten Liste ist Länge der unsortierten Liste/2 aufgerundet
	for(int i=0; i<unsorted.length; i++) {
		if(i<(int) Math.floor(unsorted.length/2)) {						//Wenn i kleiner als die abgerundete Länge des unsortierten Arrays, wird die Zahl ins linke Array kopiert
			l[i] = unsorted[i];
		}
		else{															//Sonst wird sie in die rechte Liste kopiert
			r[i-(int) Math.floor(unsorted.length/2)] = unsorted[i];
		}
	}
	l = mergeSort(l);
	r = mergeSort(r);
	return merge(l, r);
}


	private static int[] merge(int[] l, int[] r) {
		int[] merge = new int[l.length+r.length];
		int i = 0;
		int j = 0;
		for(int k = 0; k<l.length+r.length; k++) {
			if(l[i]<=r[j]) {
				merge[i] = l[i];
				i++;
			}
			else {
				merge[k] = r[j];
			}
		}
		return merge;
	}

}
