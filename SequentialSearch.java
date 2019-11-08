package groupproject;

public class SequentialSearch {
	public static int sequentialSearch(int[] elements, int target)
	   {
	      for (int j = 0; j < elements.length; j++)
	      {
	         if (elements[j] == target)
	         {
	            return j;
	         }
	     }
	     return -1;
	   }
}
