package sorting;

import java.util.Arrays;


public class QuickSortNutsAndBolts {

	public static void main(String[] args) {

	//	int[] num1 = { 1,4,3,2 };
	//	int[] num2 = {2,3,4,1};
		int[] num1 = {64, 35, 36, 37, 38, 94};
		int[] num2 = {36, 37, 35, 94, 64, 38};
	      
		System.out.println(Arrays.toString(quickSort(num1,num2, 0, num1.length - 1)));
		System.out.println(Arrays.toString(quickSort(num2,num1, 0, num2.length - 1)));
	}
	
	public static int[] quickSort(int[] num,int[] comp, int start, int end) {

		if (start > end)
			return num;

		int pivot = end;

		pivot = partition(num, comp[pivot], start, end);
		quickSort(num,comp, start, pivot - 1);
		return quickSort(num, comp,pivot + 1, end);
		
	
	}

	public static int partition(int[] inp, int pivot, int start, int end) {

		if (start >= end) {
			return start;
		}
		while (inp[start] < pivot) {
			start++;
		}
		while (inp[end] > pivot) {
			end--;
		}
		if (start < end) {
			int temp = inp[start];
			inp[start] = inp[end];
			inp[end] = temp;
		}
		return partition(inp, pivot, start, end);
	}

}
