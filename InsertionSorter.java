package groupproject;

public class InsertionSorter {
	private int[] a;
	public InsertionSorter(int[] anArray){
		a = anArray;
	}
	public void sort(){
	for (int i = 1; i < a.length; i++) {
        int current = a[i];
        int j = i - 1;
        while(j >= 0 && current < a[j]) {
            a[j+1] = a[j];
            j--;
        }
        // at this point we've exited, so j is either -1
        // or it's at the first element where current >= a[j]
        a[j+1] = current;
    	}
	}
}
