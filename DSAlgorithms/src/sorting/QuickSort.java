package sorting;

import java.util.Arrays;

import org.junit.Test;

public class QuickSort {
	
	
	public static void main(String[] args) {
		
	
		int[] nums = {99, 77, 45, 55, 2, 100,82,93,103,66,88,111,6,234,78,777,666,22,101,85,65,905};
		System.out.println(Arrays.toString(quickSort(nums,0,nums.length-1)));
		
	}
	
	
	public static int[] quickSort(int[] input, int start, int end){
		
		if(start>=end){
			return input;
		}
		int pivot = end;
		
	   pivot = partition(input, input[pivot], start, end);
	   
	   quickSort(input, start, pivot-1);
	   return quickSort(input, pivot+1,end );
		
		
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
