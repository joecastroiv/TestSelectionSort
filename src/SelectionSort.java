/**
 * 
 */
//package com.allendowney.thinkdast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;



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
	    }
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int[] array = {2, 5, 6, 1, 3};
		int howMany = 5;
		int[] myArray = getRandomArray(howMany);
		
		selectionSort(myArray);
		
		 System.out.println("Current Time in milliseconds = " + System.currentTimeMillis());
	     //System.out.println(System.currentTimeMillis());
		
		System.out.println(Arrays.toString(myArray));
		
	}

}
