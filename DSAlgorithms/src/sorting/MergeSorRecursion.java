package sorting;

import java.util.Arrays;

public class MergeSorRecursion {
	
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		
		//arr[][]
		
		int[] a = {14};
		int[] b = {16,23,82,34};
		
		System.out.println(Arrays.toString(mergeSort(a,b,0,0,0)));
		
		
	}
	
 
	
	public static int[] comb = null;

	public static int[] mergeSort(int[] a, int[] b, int aI, int bJ, int combK) {

		if (comb == null) {
			comb = new int[a.length + b.length];
		}

		if (aI >= a.length && bJ >= b.length) {
			return comb;
		}

		else if (aI >= a.length) {
			for (int x = bJ ; x < b.length; x++) {
				comb[combK] = b[x];
				combK++;
			}
			return comb;
		}

		else if (bJ >= b.length) {
			for (int x = aI ; x < a.length-1; x++) {
				comb[combK] = a[x];
				combK++;
			}
			return comb;
		}

		while (  aI<a.length && bJ<b.length &&a[aI] < b[bJ] ) {
			comb[combK] = a[aI];
			aI++;
			combK++;
		}
		while (aI<a.length && bJ<b.length && a[aI] > b[bJ] ) {
			comb[combK] = b[bJ];
			bJ++;
			combK++;
		}

		return mergeSort(a, b, aI, bJ, combK);

	}

}
