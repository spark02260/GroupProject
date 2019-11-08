package groupproject;
public class Demo {
	public static void main(String[] args){
		 int[] a = ArrayUtil.randomIntArray(100000, 1000000);
		 SelectionSorter sorter = new SelectionSorter(a);
		 StopWatch timer = new StopWatch();
		 timer.start();
		 sorter.sort();
		 timer.stop();
		 System.out.println("1. Selection Sorter Elapsed time: "+ timer.getElapsedTime() + " milliseconds");
		 
		 InsertionSorter sorter3 = new InsertionSorter(a);
		 StopWatch timer3 = new StopWatch();
		 timer3.start();
		 sorter3.sort();
		 timer3.stop();
		 System.out.println("\n2. Insertion Sorter Elapsed time: "+ timer3.getElapsedTime() + " milliseconds");
		 
		 BubbleSorter sorter1 = new BubbleSorter(a);
		 StopWatch timer1 = new StopWatch();
		 timer1.start();
		 sorter1.sort();
		 timer1.stop();
		 System.out.println("\n3. Bubble Sorter Elapsed time: "+ timer1.getElapsedTime() + " milliseconds");
	
		 MergeSorter sorter2 = new MergeSorter(a);
		 StopWatch timer2 = new StopWatch();
		 timer2.start();
		 sorter2.sort(a, 0, 0);
		 timer2.stop();
		 System.out.println("\n4. Merge Sorter Elapsed time: "+ timer2.getElapsedTime() + " milliseconds");
		 
		 BinarySearch search = new BinarySearch();
		 StopWatch timer4 = new StopWatch();
		 timer4.start();
		 var randomValue = a[(int) Math.floor(Math.random() * a.length)];
		 BinarySearch ob = new BinarySearch(); 
	        int arr[] = a; 
	        int n = arr.length; 
	        int x = randomValue; 
	        int result = ob.binarySearch(arr, 0, n - 1, x); 
	        if (result == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println("\nElement found in Binary Search at index " + result); 
		timer4.stop();
		System.out.println("5. Binary Search Elapsed time: "+ timer4.getElapsedTime() + " milliseconds");

		StopWatch timer5 = new StopWatch();
		timer5.start();
		SequentialSearch ss = new SequentialSearch(); 
	        int arr1[] = a;
	        int q = arr1.length; 
	        int w = randomValue; 
	        int result1 = ss.sequentialSearch(arr1, x); 
	        if (result1 == -1)
	            System.out.println("Element not present"); 
	        else
	            System.out.println("\nElement found in Sequential Search at index " + result1); 
		timer5.stop();
		System.out.println("6. Sequential Search Elapsed time: "+ timer5.getElapsedTime() + " milliseconds");

	}
}
