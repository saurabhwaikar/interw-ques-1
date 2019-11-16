package my.prog.collection;

import java.util.Arrays;

/**
 * 
 * @author saurabh
 *
 *	Problem: Request to merge two sorted arrays into a sorted array.
 *	The function mergeArray receives two sorted arrays and should return merged sorted array
 *
 *	For example:
 *	arr1: -1, 1, 3, 5, 7, 9
 *	arr2: -2, 2, 3, 4, 5, 6
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		int arr1[] = {-1, 1, 3, 5, 7, 9};
		int arr2[] = {-2, 2, 3, 4, 5, 6};
		int[] mergedSortedArray= mergeArray(arr1, arr2);
		
	}
	
	private static int[] mergeArray(int[] a1, int[] a2) {
		int[] ma = new int[a1.length + a2.length];
		System.arraycopy(a1, 0, ma, 0, a1.length);
		System.arraycopy(a2, 0, ma, a1.length, a2.length);
		System.out.println("After array copy : ");
		printArray(ma);
		System.out.println("\nAfter array sorting : ");
		Arrays.sort(ma);
		printArray(ma);
		return ma;
	}
	
	private static void printArray(int[] arr) {
		for(int a: arr) {
			System.out.print(a + " ");
		}
	}

}
