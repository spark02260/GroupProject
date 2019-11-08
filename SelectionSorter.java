package groupproject;

public class SelectionSorter {
	private int[] a;
	public SelectionSorter(int[] anArray)
	 {
	 a = anArray;
	 }
	public void sort()
	 {
		for (int i = 0; i < a.length; i++) {
	        int min = a[i];
	        int minId = i;
	        for (int j = i+1; j < a.length; j++) {
	            if (a[j] < min) {
	                min = a[j];
	                minId = j;
	            }
	        }
	        // swapping
	        int temp = a[i];
	        a[i] = min;
	        a[minId] = temp;
	    }
	 }
}
