package sorting;

import java.util.Arrays;


public class QuickSortNutsAndBolts {

	private static int[] nut ={64, 35, 36, 37, 38, 94,76,56,45};
	
	private static int[]  comp={36, 37, 35, 38, 64, 94,76,56,45};
	
	public static void main(String[] args) {

	quickSort(nut, comp, 0, nut.length-1);
	
	System.out.println(Arrays.toString(nut));
	System.out.println(Arrays.toString(comp));
	
	}
	
	public static void  quickSort(int[] nut,int[] comp, int start, int end) {

		if (start > end)
			return ;

		int pivot =  partition(nut, comp[end], start, end);
		pivot = partition(comp, nut[pivot], start, end);
		
		quickSort(nut, comp, start, pivot - 1);
		quickSort(nut, comp, pivot + 1, end);
		
	
	}

public static int partition(int[] input,int pivot,int start,int end){
		
		if(start>=end){
			return start;
		}
		
		while(input[start]<pivot)
		{
			start++;
		}
		
		while(input[end]>pivot )
		{
			
			end--;
		}
		if(start<=end){
		int temp = input[start];
		input[start] = input[end];
		input[end]=temp;
		}
		return partition(input, pivot, start, end);
		
	}

}
