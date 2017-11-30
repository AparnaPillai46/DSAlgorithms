package sorting.basic;

public class BinarySort {
	
	public static void main(String[] args) {
		
		int[] inp = {10,20,30,40,50,60,70,89,90,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109};
		
		System.out.println(binarySearch(inp,0,inp.length,70));
		
	}
	
	
	public static int binarySearch(int[] input,int start, int end,int target){
		
		int mid = (start + end)/2;
		//if not found
		if(mid == start || mid == end){
			return -1;
		}
		
		if(input[mid]==target ){
			return mid;
		}
		else if(input[mid]<target){
			return binarySearch(input,mid+1,end,target);
		}
		else{
			return binarySearch(input,start,mid-1,target);
		}
		
	}

}
