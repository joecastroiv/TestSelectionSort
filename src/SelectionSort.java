
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
<<<<<<< HEAD
import java.io.FileWriter;
=======

>>>>>>> branch 'main' of https://github.com/joecastroiv/TestSelectionSort


/**
 * @author downey
 *
 */
public class SelectionSort {

	/**
	 * Swaps the elements at indexes i and j.
	 */
	public static void swapElements(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * Finds the index of the lowest value
	 * between indices low and high (inclusive).
	 */
	public static int indexLowest(int[] array, int start) {
		int lowIndex = start;
		for (int i = start; i < array.length; i++) {
			if (array[i] < array[lowIndex]) {
				lowIndex = i;
			}
		}
		return lowIndex;
	}

	/**
	 * Sorts the cards (in place) using selection sort.
	 */
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = indexLowest(array, i);
			swapElements(array, i, j);
		}
	}
	
	/*public List<Integer> generateRandomArray(int n){
	    ArrayList<Integer> list = new ArrayList<Integer>(n);
	    Random random = new Random();
	    
	    n = 100;
	    
	    for (int i = 0; i < n; i++)
	    {
	        list.add(random.nextInt(999999));
	    }
	   return list;
	}  
	*/
	
	
<<<<<<< HEAD
	 public static int[] getRandomArray(int howMany) 
	 {
	        int[] returnArray = new int[howMany]; // Assume size >= 0
	        Random r = new Random();
	        for (int i = 0; i < howMany; i++) 
	        {
	        	returnArray[i] = r.nextInt(999999);   
	            //System.out.print(returnArray[i] + " ");
	            for (int n = 1; n <= returnArray.length; n++) 
	            {
	                for (int j = n + 1; j < returnArray.length; j++) 
	                {
	                    int tmp = 0;
	                    if (returnArray[j] > returnArray[n]) 
	                    {
	                        tmp = returnArray[n];
	                        returnArray[n] = returnArray[j];
	                        returnArray[j] = tmp;
	                    }
	                }
	            }
	        }
	        return returnArray;
=======
	 public static int[] getRandomArray(int howMany) {
	        int[] returnMe = new int[howMany]; // Assume size >= 0
	        Random rand = new Random();
	        for (int i = 0; i < howMany; i++) {
	            returnMe[i] = rand.nextInt(20) + 1;   //Integer.MAX_VALUE
	            System.out.print(returnMe[i] + " ");
	            for (int n = 1; n <= returnMe.length; n++) {
	                for (int j = n + 1; j < returnMe.length; j++) {
	                    int tmp = 0;
	                    if (returnMe[n] > returnMe[j]) {
	                        tmp = returnMe[n];
	                        returnMe[n] = returnMe[j];
	                        returnMe[j] = tmp;
	                    }
	                }
	            }
	        }
	        return returnMe;
>>>>>>> branch 'main' of https://github.com/joecastroiv/TestSelectionSort
	    }
	
	
	

	/**
	 * @param args
	 */
<<<<<<< HEAD
	public static void main(String[] args) throws Exception 
	{
		//int[] array = {2, 5, 6, 1, 3};
		int howMany = 250;
		int[] myArray = getRandomArray(howMany);		
		
		final long startTime = System.currentTimeMillis();
		
		selectionSort(myArray);
		
		final long endTime = System.currentTimeMillis();
		
		//System.out.println(startTime);
		//System.out.println(endTime);
		
		System.out.println("Current Time in milliseconds = " + (endTime - startTime)); //print out how long in milliseconds it took for selectionSort to sort through all the numbers
	     //System.out.println(System.currentTimeMillis());
		
		//System.out.println(Arrays.toString(myArray));
		
		FileWriter write2file = new FileWriter("docs\\arraylist"); 
		
		 int n = myArray.length;
	      for (int i = 0; i < n; i++) {
	         write2file.write(myArray[i] + "\n"); //write array numbers in order to the text document arraylist
	      }
	      write2file.close();
	   }
=======
	public static void main(String[] args) {
		//int[] array = {2, 5, 6, 1, 3};
		int howMany = 5;
		int[] myArray = getRandomArray(howMany);
		
		selectionSort(myArray);
		
		 System.out.println("Current Time in milliseconds = " + System.currentTimeMillis());
	     //System.out.println(System.currentTimeMillis());
		
		System.out.println(Arrays.toString(myArray));
		
	}
>>>>>>> branch 'main' of https://github.com/joecastroiv/TestSelectionSort


}