package sorting;

public class InsertionSort {
	
	public static int[] insertionSort(int[] arr) {
		
	for(int i=1;i<arr.length;i++) {
			int pivot = arr[i];
			int j=i-1;
			while(j>=0&& arr[j]>pivot) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1]=pivot;
		}
		return arr;
		
	}
	
	   /* A utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    {         
        int arr[] = {4, 3, 2}; 
  
        InsertionSort ob = new InsertionSort();         
        ob.insertionSort(arr); 
          
        printArray(arr); 
    }

}
