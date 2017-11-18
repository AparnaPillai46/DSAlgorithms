package sorting;

import java.util.Arrays;

public class MergeSortWithoutRecursion {

	public static void main(String[] args) {

		int[][] arr = new int[3][4];

		// arr[][]

		int[] a = { 14,15,17 };
		int[] b = { 16, 23, 34, 82 };

		System.out.println(Arrays.toString(mergeSort(a, b)));

	}

	public static int[] comb = null;

	public static int[] mergeSort(int[] a, int[] b) {

		if (comb == null) {
			comb = new int[a.length + b.length];
		}

		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				comb[k] = a[i];
				i++;
				k++;
			} else {
				comb[k] = b[j];
				j++;
				k++;
			}
		}

		while (i < a.length) {
			comb[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			comb[k] = b[j];
			j++;
			k++;
		}
		return comb;

	}

}
