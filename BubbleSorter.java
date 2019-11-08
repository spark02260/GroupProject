package groupproject;

public class BubbleSorter {
	private int[] a;
	public BubbleSorter(int[] anArray){
		a = anArray;
	}
	public void sort(){
	   boolean sorted = false;
	   int temp;
	   while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] > a[i+1]) {
	                temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	}
}